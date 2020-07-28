package com.neusoft.hotel.fd.service;

import java.util.List;

import com.neusoft.hotel.fd.model.RoomModel;

//客房列表的Service层
public interface IRoomService {
	
	public List<RoomModel> getListByAll() throws Exception;
	

}
