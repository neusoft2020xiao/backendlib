package com.neusoft.hotel.eneity.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.hotel.eneity.model.ICheckInModel;


@Component
public interface CheckInMapper {
    Integer getCount();
    int deleteByPrimaryKey(Integer checkInId);

    int insert(CheckIn record);

    int insertSelective(CheckIn record);

    CheckIn selectByPrimaryKey(Integer checkInId);

    CheckIn selectLatestByRoomNumber(String roomNumber);

    int updateByRoomNumber(String roomNumber);

    int checkOut(Integer checkInId);

    int updateByPrimaryKeySelective(CheckIn record);

    int updateByPrimaryKey(CheckIn record);

    List<CheckIn> selectAll();

}
