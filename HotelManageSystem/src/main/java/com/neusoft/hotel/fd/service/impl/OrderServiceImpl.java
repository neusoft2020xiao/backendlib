package com.neusoft.hotel.fd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.fd.mapper.IOrderMapper;
import com.neusoft.hotel.fd.model.OrderModel;
import com.neusoft.hotel.fd.service.IOrderService;

@Service
@Transactional //环绕事务Advice的切入点
public class OrderServiceImpl implements IOrderService{

	@Autowired
	private IOrderMapper ordermapper = null;
	@Override
	public void addOrder(OrderModel order) throws Exception {
		ordermapper.insert(order);
	}

	@Override
	public void delete(OrderModel order) throws Exception {
		ordermapper.delete(order);
	}

	@Override
	public void modify(OrderModel order) throws Exception {
		ordermapper.update(order);
	}

	@Override
	public void modifyOrder(OrderModel order) throws Exception {
		ordermapper.updateordertype(order);
	}

	@Override
	public List<OrderModel> AllOrdersByType(String OrderType) throws Exception {
		return ordermapper.selectByOrderType(OrderType);
	}

	@Override
	public List<OrderModel> AllOrders() throws Exception {
		return ordermapper.selectByAll();
	}

	@Override
	public List<OrderModel> selectById(String userId) throws Exception {
		return ordermapper.selectByUserId(userId);
	}

}
