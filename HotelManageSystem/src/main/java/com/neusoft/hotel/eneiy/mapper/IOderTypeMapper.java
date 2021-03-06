package com.neusoft.hotel.eneity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.hotel.eneity.model.OrderTypeModel;

@Mapper
public interface IOderTypeMapper {

	public void insert(OrderTypeModel orderType) throws Exception;
	
	public void update(OrderTypeModel orderType) throws Exception;
	
	public void delete(OrderTypeModel orderType) throws Exception;
	
	public List<OrderTypeModel> selectByAll() throws Exception;
	
}
