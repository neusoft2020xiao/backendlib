package com.neusoft.hotel.eneity.service;

import java.util.List;
import java.util.HashMap;
import com.neusoft.hotel.eneity.model.RoomModel;
import com.neusoft.hotel.eneity.model.ICheckInModel;
public interface CheckInService {

    int insert(CheckIn checkIn);

    Room checkIn(CheckIn checkIn);

    int delete(int checkInId);

    int update(CheckIn checkIn);

    int checkOut(String roomNumber);

    int updateByRoomNumber(String roomNumber);

    CheckIn selectById(int checkInId);

    List<CheckIn> selectAll();

}
