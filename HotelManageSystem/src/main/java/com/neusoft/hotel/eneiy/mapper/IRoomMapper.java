package com.neusoft.hotel.eneity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.hotel.eneity.model.RoomModel;

@Mapper
public interface IRoomMapper {
	
	//显示room列表
	public List<RoomModel> selectByAll() throws Exception;
	
	//特定价格区间的room列表
	public List<RoomModel> selectByPrice(@Param("high")double high,@Param("low")double low) throws Exception;
	
	//更新room状态
	public void update(RoomModel room) throws Exception;


}
