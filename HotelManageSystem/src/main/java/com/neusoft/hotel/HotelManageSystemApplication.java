package com.neusoft.hotel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.neusoft.hotel.fd.mapper"})
public class HotelManageSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelManageSystemApplication.class, args);
	}

}
