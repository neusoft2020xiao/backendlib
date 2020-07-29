package com.neusoft.hotel.fd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.fd.model.OrderModel;
import com.neusoft.hotel.fd.service.IOrderService;
import com.neusoft.hotel.result.Result;

@RestController
@RequestMapping(value="/order")
public class OrderController {
	@Autowired
	IOrderService os=null;
	
	@RequestMapping(value="/add")
	public Result<String> add(@RequestBody OrderModel om) throws Exception{
		os.addOrder(om);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加订单成功!");
		return result;		
	}
	
	@RequestMapping(value="/delete")
	public Result<String> delete(@RequestBody OrderModel om) throws Exception{
		os.delete(om);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("取消订单成功!");
		return result;		
	}
	
	@RequestMapping(value="/modify")
	public Result<String> modify(@RequestBody OrderModel om) throws Exception{
		os.modify(om);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("预定订单成功执行!");
		return result;		
	}
	
	@RequestMapping(value="/modifyOrder")
	public Result<String> modifyOrder(@RequestBody OrderModel om) throws Exception{
		os.modifyOrder(om);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("订单结账成功!");
		return result;		
	}
	
	@GetMapping(value="/get")
	public Result<OrderModel> selectById(@RequestParam(required=true) String userId) throws Exception{
		Result<OrderModel> result=new Result<OrderModel>();
		result.setResult((OrderModel) os.selectById(userId));
		result.setStatus("OK");
		result.setMessage("取得指定订单成功!");
		return result;
	}
	
	@GetMapping(value="/list/all")
	public Result<OrderModel> getListByAll() throws Exception{
		Result<OrderModel> result=new Result<OrderModel>();
		result.setList(os.AllOrders());
		result.setStatus("OK");
		result.setMessage("取得全部订单列表成功!");
		return result;
	}
	
	@GetMapping(value="/list/orderbytype")
	public Result<OrderModel> AllOrdersByType(@RequestParam(required=true) String OrderType) throws Exception{
		Result<OrderModel> result=new Result<OrderModel>();
		result.setList(os.AllOrdersByType(OrderType));
		result.setStatus("OK");
		result.setMessage("取得类型订单列表成功!");
		return result;
		
	}
	
}
