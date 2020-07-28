package com.neusoft.hotel.fd.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.hotel.fd.model.HotelModel;

//酒店信息的Mapper接口

@Mapper
public interface IHotelMapper {

	public HotelModel selectById(String hotelId) throws Exception;
	
}
