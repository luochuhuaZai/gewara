/** <a href="http://www.cpupk.com/decompiler">Eclipse Class Decompiler</a> plugin, Copyright (c) 2017 Chen Chao. **/
package com.gewara.support;

import java.io.Serializable;

public class CachePair implements Serializable {
	private static final long serialVersionUID = -2099185753636160455L;
	private Long version;
	private Object value;

	public Long getVersion() {
		return this.version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}