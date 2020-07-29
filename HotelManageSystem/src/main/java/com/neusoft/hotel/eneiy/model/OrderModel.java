package com.neusoft.hotel.eneity.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonFormat;

@Alias("Order")
public class OrderModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Integer orderId;
    private Integer orderTypeId;
    private String orderType;
    private Integer userId;
    private String name;
    private String phone;
    private Integer roomTypeId;
    private String roomType;
    private Date orderDate;
    private Integer orderDays;
    private Integer orderStatus;
    private Double orderCost;
    @JsonFormat(pattern="yy-mm-dd HH:mm:ss")
    private Date createTime;
    @JsonFormat(pattern="yy-mm-dd HH:mm:ss")
    private Date updateTime;
    
    private OrderTypeModel ordertype=null;
    private RoomTypeModel roomtype=null;
    private UserModel user=null;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getOrderTypeId() {
		return orderTypeId;
	}
	public void setOrderTypeId(Integer orderTypeId) {
		this.orderTypeId = orderTypeId;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	public Integer getRoomTypeId() {
		return roomTypeId;
	}
	public void setRoomTypeId(Integer roomTypeId) {
		this.roomTypeId = roomTypeId;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Integer getOrderDays() {
		return orderDays;
	}
	public void setOrderDays(Integer orderDays) {
		this.orderDays = orderDays;
	}
	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Double getOrderCost() {
		return orderCost;
	}
	public void setOrderCost(Double orderCost) {
		this.orderCost = orderCost;
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
	public OrderTypeModel getOrdertype() {
		return ordertype;
	}
	public void setOrdertype(OrderTypeModel ordertype) {
		this.ordertype = ordertype;
	}
	public RoomTypeModel getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(RoomTypeModel roomtype) {
		this.roomtype = roomtype;
	}
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    

}
