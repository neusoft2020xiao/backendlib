package com.neusoft.hotel.fd.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonFormat;

@Alias("Room")
public class RoomModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Integer roomId;
    private String roomNumber;
    private Integer typeId;
    private String roomType;
    private Double roomPrice;
    private Double roomDiscount;
    private Integer roomStatus;
    private String remark;
    @JsonFormat(pattern="yy-mm-dd HH:mm:ss")
    private Date createTime;
    @JsonFormat(pattern="yy-mm-dd HH:mm:ss")
    private Date updateTime;
    
    private RoomTypeModel roomtype = null;

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

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

	public Double getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(Double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public Double getRoomDiscount() {
		return roomDiscount;
	}

	public void setRoomDiscount(Double roomDiscount) {
		this.roomDiscount = roomDiscount;
	}

	public Integer getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(Integer roomStatus) {
		this.roomStatus = roomStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public RoomTypeModel getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(RoomTypeModel roomtype) {
		this.roomtype = roomtype;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
    
	

}
