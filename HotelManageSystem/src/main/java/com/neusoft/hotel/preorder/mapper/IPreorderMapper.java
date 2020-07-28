package com.neusoft.hotel.preorder.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.hotel.preorder.model.PreorderModel;

@Mapper
public interface IPreorderMapper {

	public void insert(PreorderModel pm) throws Exception;
	
	public void delete(PreorderModel pm) throws Exception;
	
	public PreorderModel selectbyId(@Param("id") int id) throws Exception;
	
	public PreorderModel selectbyPhone(@Param("phone") String phone) throws Exception;
	
	public PreorderModel selectbyName(@Param("name") String name) throws Exception;
	
	public List<PreorderModel> selectListByAll() throws Exception;
}
