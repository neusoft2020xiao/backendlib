package com.neusoft.hotel.fd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.fd.model.RoomModel;
import com.neusoft.hotel.fd.service.IRoomService;
import com.neusoft.hotel.result.Result;
//客房列表的Controller
@RestController
@RequestMapping(value="/room")
public class RoomController {
	
	@Autowired
	IRoomService roomService = null;
	
	@RequestMapping(value="/list")
    public Result<RoomModel> list() throws Exception{
		List<RoomModel> list = roomService.getListByAll();
		Result<RoomModel> result = new  Result<RoomModel>();
		if(list!=null) {
	    	result.setList(list);
	    	result.setStatus("OK");
	    	result.setMessage("查看成功");
		}
		else {
	    	result.setStatus("ERROR");
	    	result.setMessage("客房不存在");
		}
    	return result;
    }

}
