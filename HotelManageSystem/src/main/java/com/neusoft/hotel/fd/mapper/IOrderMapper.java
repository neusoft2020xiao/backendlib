package com.neusoft.hotel.fd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.hotel.fd.model.OrderModel;

@Mapper
public interface IOrderMapper {

	public void insert(OrderModel order) throws Exception;
	
	public void update(OrderModel order) throws Exception;
	
	public void delete(OrderModel order) throws Exception;
	//修改订单类型
	public void updateordertype(OrderModel order) throws Exception;
	//显示所有订单列表
	public List<OrderModel> selectByAll() throws Exception;
	
	//根据userId显示订单列表
	public List<OrderModel> selectByUserId(String userId) throws Exception;
	
	//显示所有预定订单
	public List<OrderModel> selectByOrderType(String orderType) throws Exception; 
	
}
