package com.neusoft.hotel.preorder.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.preorder.mapper.IPreorderMapper;
import com.neusoft.hotel.preorder.model.PreorderModel;
import com.neusoft.hotel.preorder.service.IPreorderService;

@Service
@Transactional
public class PreorderServiceImpl implements IPreorderService {
	@Autowired
	private IPreorderMapper preorderMapper=null;
	@Override
	public void add(PreorderModel pm) throws Exception {
		preorderMapper.insert(pm);
	}

	@Override
	public void delete(PreorderModel pm) throws Exception {
		preorderMapper.delete(pm);
	}

	@Override
	public PreorderModel getbyid(int id) throws Exception {
		return preorderMapper.selectbyId(id);
	}

	@Override
	public PreorderModel getbyname(String name) throws Exception {
		return preorderMapper.selectbyName(name);
	}

	@Override
	public PreorderModel getbyphone(String phone) throws Exception {
		return preorderMapper.selectbyPhone(phone);
	}

	@Override
	public List<PreorderModel> getListbyall() throws Exception {
		return preorderMapper.selectListByAll();
	}

}
