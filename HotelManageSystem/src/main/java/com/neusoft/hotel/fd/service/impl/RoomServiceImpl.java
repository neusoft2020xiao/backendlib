package com.neusoft.hotel.fd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.fd.mapper.IRoomMapper;
import com.neusoft.hotel.fd.model.RoomModel;
import com.neusoft.hotel.fd.service.IRoomService;



@Service
@Transactional //环绕事务Advice的切入点
public class RoomServiceImpl implements IRoomService {
	
	@Autowired
	IRoomMapper roomMapper = null;

	@Override
	public List<RoomModel> getListByAll() throws Exception {
		return roomMapper.selectByAll();
	}

}
