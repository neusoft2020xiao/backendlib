package com.neusoft.hotel.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.management.model.RoomModel;
import com.neusoft.hotel.management.service.IRoomService;
import com.neusoft.hotel.restresult.Result;

@RestController
@RequestMapping(value="/room")
@CrossOrigin(origins = {"*", "null"})
public class RoomController {
	
	@Autowired
	private IRoomService ds=null;
		
	@PostMapping(value="/add")
	public Result<String> add(@RequestBody RoomModel dm) throws Exception{
		ds.add(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("增加房间成功!");
		return result;
		
	}
	@PostMapping(value="/modify")
	public Result<String> modify(@RequestBody RoomModel dm) throws Exception{
		ds.modify(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("修改房间成功!");
		return result;
	}
	@PostMapping(value="/delete")
	public Result<String> delete(@RequestBody RoomModel dm) throws Exception{
		ds.delete(dm);
		Result<String> result=new Result<String>();
		result.setStatus("OK");
		result.setMessage("删除房间成功!");
		return result;
	}
	//取得房间列表，分页模式
	@GetMapping(value="/list/all/page")
	public Result<RoomModel> getListByAllWitgPage(@RequestParam(required=false,defaultValue="10") int rows,@RequestParam(required=false,defaultValue="1") int page) throws Exception{
		Result<RoomModel> result=new Result<RoomModel>();
		result.setCount(ds.getCountByAll());
		result.setPageCount(ds.getPageCountByAll(rows));
		result.setRows(rows);
		result.setPage(page);
		result.setList(ds.getListByAllWithPage(rows, page));
		
		result.setStatus("OK");
		result.setMessage("取得房间列表分页方式成功!");
		return result;
	}
	@GetMapping(value="/get")
	public Result<RoomModel> getByNo(@RequestParam(required=true) int no) throws Exception{
		Result<RoomModel> result=new Result<RoomModel>();
		result.setResult(ds.getByNo(no));
		
		result.setStatus("OK");
		result.setMessage("取得指定房间对象成功!");
		return result;
	}
	

}
