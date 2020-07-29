package com.neusoft.hotel.fd.service;

import java.util.List;

import com.neusoft.hotel.fd.model.OrderModel;

public interface IOrderService {
	//增加新订单
	void addOrder(OrderModel order)throws Exception;
	//取消订单
	void delete(OrderModel order)throws Exception;
	//预定完成转为普通订单
	public void modify(OrderModel order) throws Exception;
	//结账
	public void modifyOrder(OrderModel order) throws Exception;	
	//查看所有预定订单
	List<OrderModel> AllOrdersByType(String OrderType)throws Exception;
	//查看所有订单
	List<OrderModel> AllOrders()throws Exception;
	//查找订单号
	List<OrderModel> selectById(String userId)throws Exception;
}
