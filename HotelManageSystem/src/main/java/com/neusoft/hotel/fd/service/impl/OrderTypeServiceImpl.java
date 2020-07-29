package com.neusoft.hotel.fd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.fd.mapper.IOderTypeMapper;
import com.neusoft.hotel.fd.model.OrderTypeModel;
import com.neusoft.hotel.fd.service.IOrderTypeService;

@Service
@Transactional //环绕事务Advice的切入点
public class OrderTypeServiceImpl implements IOrderTypeService{
	
	@Autowired
	private IOderTypeMapper ordertypemapper = null;
	@Override
	public List<OrderTypeModel> selectAll() throws Exception {
		return ordertypemapper.selectByAll();
	}

}
