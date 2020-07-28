package com.neusoft.hotel.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.hotel.member.model.MemberModel;

@Mapper
public interface IMemberMapper {

	public void insert(MemberModel mm) throws Exception;
	
	public void delete(MemberModel mm) throws Exception;
	
	public void update(MemberModel mm) throws Exception;
	
	public MemberModel selectbyId(@Param("memberid") int memberid) throws Exception;
	
	public List<MemberModel> selectListByAll() throws Exception;
	
}
