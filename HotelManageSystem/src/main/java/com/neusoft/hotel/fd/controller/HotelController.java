package com.neusoft.hotel.fd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.fd.model.HotelModel;
import com.neusoft.hotel.fd.service.IHotelService;
import com.neusoft.hotel.result.Result;

//酒店的Controller控制器

@RestController
@RequestMapping(value="/hotel")
public class HotelController {
	
	@Autowired
	IHotelService hotelService = null;

	@RequestMapping(value="/view")
    public Result<HotelModel> view(String userId) throws Exception{
		HotelModel hotel = hotelService.view(userId);
		Result<HotelModel> result = new  Result<HotelModel>();
		if(hotel!=null) {
	    	result.setResult(hotelService.view(userId));
	    	result.setStatus("OK");
	    	result.setMessage("查看成功");
		}
		else {
	    	result.setStatus("ERROR");
	    	result.setMessage("酒店id输入错误");
		}
    	return result;
    }
}
