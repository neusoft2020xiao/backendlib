package com.neusoft.hotel.fd.service;

import com.neusoft.hotel.fd.model.UserModel;

public interface IUserService {
	
	//注册账号
	public void register(UserModel user) throws Exception;
	
	//验证用户登录账号密码正确性
	public boolean validate(String userId,String password) throws Exception;
	
	//修改资料
	public void modify(UserModel user) throws Exception;
	
	//修改密码
	public void modifyPassword(UserModel user) throws Exception;
	
	//根据用户ID获取用户对象
	public UserModel getById(String userId) throws Exception;
	
	//完善个人资料
	public void complete(UserModel user) throws Exception;

}
