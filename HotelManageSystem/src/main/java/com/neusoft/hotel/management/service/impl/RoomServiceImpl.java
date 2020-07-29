package com.neusoft.hotel.management.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.hotel.management.mapper.IRoomMapper;
import com.neusoft.hotel.management.model.RoomModel;
import com.neusoft.hotel.management.service.IRoomService;


@Service
@Transactional  //环绕事务Advice的切入点
public class RoomServiceImpl implements IRoomService {
	@Autowired
	private IRoomMapper roomMapper=null;
	@Override
	public int add(RoomModel dm) throws Exception {
		roomMapper.insert(dm);
		return dm.getRoomId();
	}

	@Override
	public void modify(RoomModel dm) throws Exception {
		roomMapper.update(dm);
	}

	@Override
	public void delete(RoomModel dm) throws Exception {
		roomMapper.delete(dm);
	}

	@Override
	public List<RoomModel> getListByAll() throws Exception {
		
		return roomMapper.selectByAll();
	}

	@Override
	public List<RoomModel> getListByAllWithPage(int rows, int page) throws Exception {
		
		return roomMapper.selectByAllWithPage(rows*(page-1), rows);
	}

	@Override
	public RoomModel getByNo(int no) throws Exception {
		return roomMapper.selectByPrimaryKey(no);
	}
	
	@Override
	public int getCountByAll() throws Exception {
		
		return roomMapper.selectCountByAll();
	}

	@Override
	public int getPageCountByAll(int rows) throws Exception {
		
		int count=this.getCountByAll();
		int pageCount=0;
		if(count%rows==0) {
			pageCount=count/rows;
		}
		else {
			pageCount=count/rows+1;
		}
		
		return pageCount;
	}



}
