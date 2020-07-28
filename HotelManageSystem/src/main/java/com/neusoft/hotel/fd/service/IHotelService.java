package com.neusoft.hotel.fd.service;

import com.neusoft.hotel.fd.model.HotelModel;

public interface IHotelService {
	
	//查看酒店信息
	public HotelModel view(String hotelId) throws Exception;

}
