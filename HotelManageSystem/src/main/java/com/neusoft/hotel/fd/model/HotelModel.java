package com.neusoft.hotel.fd.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonFormat;

@Alias("Hotel")
public class HotelModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer hotelId;
    private String hotelName;
	private String phone;
    private String telephone;
	private String email;
	private String address;
	private String website;
    @JsonFormat(pattern="yy-mm-dd HH:mm:ss")
    private Date createTime;
    @JsonFormat(pattern="yy-mm-dd HH:mm:ss")
	private Date updateTime;
    
    
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
