package com.neusoft.hotel.fd.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonFormat;

//用户资料的Model类
@Alias("User")
public class UserModel implements Serializable{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer userId;
	 private String userName;
	 private String password;
	 private String name;
	 private String gender;
	 private String phone;
	 private String email;
	 private String address;
	 private String idcard;
     @JsonFormat(pattern="yy-mm-dd HH:mm:ss")
	 private Date createTime;
     @JsonFormat(pattern="yy-mm-dd HH:mm:ss")
	 private Date updateTime;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	
}
