package com.neusoft.hotel.fd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.fd.mapper.IHotelMapper;
import com.neusoft.hotel.fd.model.HotelModel;
import com.neusoft.hotel.fd.service.IHotelService;

@Service
@Transactional //环绕事务Advice的切入点
public class HotelServiceImpl implements IHotelService {
	
	@Autowired
	private IHotelMapper hotelMapper = null;

	@Override
	public HotelModel view(String hotelId) throws Exception {
		return hotelMapper.selectById(hotelId);
	}

}
