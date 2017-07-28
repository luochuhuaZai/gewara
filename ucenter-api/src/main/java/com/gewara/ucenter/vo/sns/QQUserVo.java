/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.ucenter.vo.sns;

import com.gewara.api.vo.BaseVo;
import java.io.Serializable;

public class QQUserVo extends BaseVo {
	private static final long serialVersionUID = 1802961426295490624L;
	private String subscribe;
	private String openid;
	private String nickname;
	private String sex;
	private String language;
	private String city;
	private String province;
	private String country;
	private String headimgurl;
	private String subscribe_time;
	private String remark;
	private String groupid;
	private String unionid;
	private String bindGewa;
	private String bindGewaMobile;
	private String bindGewaNickname;

	public String getSubscribe() {
		return this.subscribe;
	}

	public void setSubscribe(String subscribe) {
		this.subscribe = subscribe;
	}

	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHeadimgurl() {
		return this.headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public String getSubscribe_time() {
		return this.subscribe_time;
	}

	public void setSubscribe_time(String subscribe_time) {
		this.subscribe_time = subscribe_time;
	}

	public String getUnionid() {
		return this.unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public Serializable realId() {
		return this.openid;
	}

	public String getBindGewa() {
		return this.bindGewa;
	}

	public void setBindGewa(String bindGewa) {
		this.bindGewa = bindGewa;
	}

	public String getBindGewaMobile() {
		return this.bindGewaMobile;
	}

	public void setBindGewaMobile(String bindGewaMobile) {
		this.bindGewaMobile = bindGewaMobile;
	}

	public String getBindGewaNickname() {
		return this.bindGewaNickname;
	}

	public void setBindGewaNickname(String bindGewaNickname) {
		this.bindGewaNickname = bindGewaNickname;
	}
}