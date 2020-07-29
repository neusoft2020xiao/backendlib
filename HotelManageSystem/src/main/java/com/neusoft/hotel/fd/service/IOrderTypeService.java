package com.neusoft.hotel.fd.service;

import java.util.List;

import com.neusoft.hotel.fd.model.OrderTypeModel;

public interface IOrderTypeService {
	//显示ordertype列表
	List<OrderTypeModel> selectAll() throws Exception;
}
