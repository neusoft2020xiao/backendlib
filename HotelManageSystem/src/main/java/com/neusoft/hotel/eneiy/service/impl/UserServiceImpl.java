package com.neusoft.hotel.eneity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.eneity.mapper.IUserMapper;
import com.neusoft.hotel.eneity.model.UserModel;
import com.neusoft.hotel.eneity.service.IUserService;

@Service
@Transactional //环绕事务Advice的切入点
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserMapper userMapper = null;

	@Override
	public boolean validate(String userId, String password) throws Exception {
		UserModel user = userMapper.selectById(userId);
		if(user!=null && user.getPassword().equals(password)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void modify(UserModel user) throws Exception {
		userMapper.update(user);
		
	}

	@Override
	public void modifyPassword(UserModel user) throws Exception {
		userMapper.updatePassword(user);
		
	}

	@Override
	public UserModel getById(String userId) throws Exception {
		 return userMapper.selectById(userId);
	}

	@Override
	public void register(UserModel user) throws Exception {
		userMapper.insert(user);		
	}

	@Override
	public void complete(UserModel user) throws Exception {
		userMapper.update(user);		
	}

}
