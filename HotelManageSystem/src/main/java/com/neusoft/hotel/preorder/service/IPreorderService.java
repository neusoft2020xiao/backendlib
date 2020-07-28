package com.neusoft.hotel.preorder.service;

import java.util.List;

import com.neusoft.hotel.preorder.model.PreorderModel;

public interface IPreorderService {
	
	public void add(PreorderModel pm)throws Exception;
	
	public void delete(PreorderModel pm)throws Exception;

	public PreorderModel getbyid(int id)throws Exception;

	public PreorderModel getbyname(String name)throws Exception;

	public PreorderModel getbyphone(String phone)throws Exception;

	public List<PreorderModel> getListbyall()throws Exception;
}
