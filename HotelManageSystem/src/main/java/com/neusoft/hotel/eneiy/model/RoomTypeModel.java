package com.neusoft.hotel.eneity.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("RoomType")
public class RoomTypeModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Integer typeId;
    private String roomType;
    private String remark;
    private Double price;
    private Double discount;
    private Integer area;
    private Integer bedNum;
    private String bedSize;
    private Integer window;
    private Integer rest;
    
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public Integer getBedNum() {
		return bedNum;
	}
	public void setBedNum(Integer bedNum) {
		this.bedNum = bedNum;
	}
	public String getBedSize() {
		return bedSize;
	}
	public void setBedSize(String bedSize) {
		this.bedSize = bedSize;
	}
	public Integer getWindow() {
		return window;
	}
	public void setWindow(Integer window) {
		this.window = window;
	}
	public Integer getRest() {
		return rest;
	}
	public void setRest(Integer rest) {
		this.rest = rest;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
}
