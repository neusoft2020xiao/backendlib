package com.neusoft.hotel.eneity.service;

import java.util.List;

import com.neusoft.hotel.eneity.model.RoomModel;

//客房列表的Service层
public interface IRoomService {
	
	public List<RoomModel> getListByAll() throws Exception;
	

}
