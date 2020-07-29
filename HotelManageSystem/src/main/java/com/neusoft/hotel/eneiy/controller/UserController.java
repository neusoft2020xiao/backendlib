package com.neusoft.hotel.eneity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.eneity.model.UserModel;
import com.neusoft.hotel.eneity.service.IUserService;
import com.neusoft.hotel.result.Result;

//Controller控制器
@RestController
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	IUserService userService = null;
	
	@RequestMapping(value="/register")
    public Result<String> register(UserModel user) throws Exception{
    	userService.register(user);
    	Result<String> result = new  Result<String>();
    	result.setStatus("OK");
    	result.setMessage("注册成功");
    	return result;
    }
	
	@RequestMapping(value="/login")
    public Result<String> login(String userId,String password) throws Exception{
    	boolean isExist = userService.validate(userId, password);
    	Result<String> result = new  Result<String>();
    	if(isExist) {
        	result.setStatus("OK");
        	result.setMessage("登录成功");
    	}
    	else {
        	result.setStatus("ERROR");
        	result.setMessage("用户密码错误");
    	}
    	return result;
    }
	
	@RequestMapping(value="/view")
    public Result<UserModel> view(String userId) throws Exception{
		UserModel user = userService.getById(userId);
		Result<UserModel> result = new  Result<UserModel>();
		if(user!=null) {
	    	result.setResult(userService.getById(userId));
	    	result.setStatus("OK");
	    	result.setMessage("查看成功");
		}
		else {
	    	result.setStatus("ERROR");
	    	result.setMessage("用户不存在");
		}
    	return result;
    }
}
