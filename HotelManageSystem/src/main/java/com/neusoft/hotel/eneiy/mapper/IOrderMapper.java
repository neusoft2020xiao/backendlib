package com.neusoft.hotel.eneity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.hotel.eneity.model.OrderModel;

@Mapper
public interface IOrderMapper {

	public void insert(OrderModel order) throws Exception;
	
	public void update(OrderModel order) throws Exception;
	
	public void delete(OrderModel order) throws Exception;
	
	//显示所有预定订单列表
	public List<OrderModel> selectByAll() throws Exception;
	
	//根据userId显示订单列表
	public List<OrderModel> selectByUserId(String userId) throws Exception;
	
}
