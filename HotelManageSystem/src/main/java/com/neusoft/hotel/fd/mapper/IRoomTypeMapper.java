package com.neusoft.hotel.fd.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.hotel.fd.model.RoomTypeModel;

@Mapper
public interface IRoomTypeMapper {

	//根据roomTypeId查找类型
	public RoomTypeModel selectById(String roomTypeId) throws Exception;
	
}
