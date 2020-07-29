package com.neusoft.hotel.eneity.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.hotel.eneity.model.UserModel;

//Mapper接口

@Mapper
public interface IUserMapper {
	
	public void insert(UserModel user) throws Exception;
	
	public void update(UserModel user) throws Exception;
	
	public void updatePassword(UserModel user) throws Exception;
	
	public void delete(UserModel user) throws Exception;
	
	public UserModel selectById(String userId) throws Exception;
	
	

}
