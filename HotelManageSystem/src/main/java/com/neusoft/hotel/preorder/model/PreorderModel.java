package com.neusoft.hotel.preorder.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("preorder")
public class PreorderModel {
	private Integer preorderId;
	private String name;
	private String phone;
	private Date orderDate;
	private String roomtype;
	private Integer orderDays;
	private Date createTime;
	public Integer getPreorderId() {
		return preorderId;
	}
	public void setPreorderId(Integer preorderId) {
		this.preorderId = preorderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public Integer getOrderDays() {
		return orderDays;
	}
	public void setOrderDays(Integer orderDays) {
		this.orderDays = orderDays;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
