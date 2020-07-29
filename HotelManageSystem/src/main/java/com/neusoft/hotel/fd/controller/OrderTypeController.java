package com.neusoft.hotel.fd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.fd.model.OrderTypeModel;
import com.neusoft.hotel.fd.service.IOrderTypeService;
import com.neusoft.hotel.result.Result;

@RestController
@RequestMapping(value="/ordertype")
public class OrderTypeController {
	@Autowired
	IOrderTypeService ot=null;
	@GetMapping(value="/list/all")
	public Result<OrderTypeModel> getListByAll() throws Exception{
		Result<OrderTypeModel> result=new Result<OrderTypeModel>();
		result.setList(ot.selectAll());
		result.setStatus("OK");
		result.setMessage("取得全部订单列表成功!");
		return result;
	}
}
