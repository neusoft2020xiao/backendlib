package com.neusoft.hotel.member.model;

import org.apache.ibatis.type.Alias;

@Alias("member")
public class MemberModel {
	//会员编号
	private Integer memberid;
	//会员姓名
	private String name;
	//会员等级
	private char level;
	//会员电话
	private String phone;
	public Integer getMemberid() {
		return memberid;
	}
	public void setMemberid(Integer memberid) {
		this.memberid = memberid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getLevel() {
		return level;
	}
	public void setLevel(char level) {
		this.level = level;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}	
}
