package com.neusoft.hotel.fd.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonFormat;

@Alias("OrderType")
public class OrderTypeModel implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer typeId;
    private String type;
    private String remark;
    @JsonFormat(pattern="yy-mm-dd HH:mm:ss")
    private Date createTime;
    @JsonFormat(pattern="yy-mm-dd HH:mm:ss")
    private Date updateTime;
    
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
