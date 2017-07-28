/** <a href="http://www.cpupk.com/decompiler">Eclipse Class Decompiler</a> plugin, Copyright (c) 2017 Chen Chao. **/
package com.gewara.support;

import java.io.Serializable;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Order;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.type.Type;

public class NullPropertyOrder extends Order implements Serializable {
	private static final long serialVersionUID = -3338615419291629533L;
	private String propertyName;
	private boolean ascending;
	private boolean ignoreCase;
	private boolean nulls;

	protected NullPropertyOrder(String propertyName, boolean ascending, boolean nulls) {
		super(propertyName, ascending);
		this.propertyName = propertyName;
		this.ascending = ascending;
		this.nulls = nulls;
	}

	public NullPropertyOrder ignoreCase() {
		this.ignoreCase = true;
		return this;
	}

	public String toSqlString(Criteria criteria, CriteriaQuery criteriaQuery) throws HibernateException {
		String[] columns = criteriaQuery.getColumnsUsingProjection(criteria, this.propertyName);
		Type type = criteriaQuery.getTypeUsingProjection(criteria, this.propertyName);
		StringBuilder fragment = new StringBuilder();

		for (int i = 0; i < columns.length; ++i) {
			SessionFactoryImplementor factory = criteriaQuery.getFactory();
			boolean lower = this.ignoreCase && type.sqlTypes(factory)[i] == 12;
			if (lower) {
				fragment.append(factory.getDialect().getLowercaseFunction()).append('(');
			}

			fragment.append(columns[i]);
			if (lower) {
				fragment.append(')');
			}

			fragment.append(this.ascending ? " asc" : " desc");
			fragment.append(" nulls " + (this.nulls ? "first" : "last"));
			if (i < columns.length - 1) {
				fragment.append(", ");
			}
		}

		return fragment.toString();
	}

	public static NullPropertyOrder asc(String propertyName, boolean nulls) {
		return new NullPropertyOrder(propertyName, true, nulls);
	}

	public static NullPropertyOrder desc(String propertyName, boolean nulls) {
		return new NullPropertyOrder(propertyName, false, nulls);
	}

	public static NullPropertyOrder asc(String propertyName) {
		return asc(propertyName, false);
	}

	public static NullPropertyOrder desc(String propertyName) {
		return desc(propertyName, false);
	}

	public String toString() {
		return this.propertyName + ' ' + (this.ascending ? "asc" : "desc  nulls " + (this.nulls ? "first" : "last"));
	}
}