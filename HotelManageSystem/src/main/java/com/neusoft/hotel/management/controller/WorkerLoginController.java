package com.neusoft.hotel.management.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.neusoft.hotel.management.model.WorkerModel;
import com.neusoft.hotel.management.service.IWorkerService;



@RestController
@RequestMapping(value="/login")
public class WorkerLoginController {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Autowired
	IWorkerService worker=null;
	

	@PostMapping(value="/login")
	public String doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//取得提交的数据
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		//创建管理员的业务对象		

			WorkerModel wm=worker.getByName(username);
			if(wm!=null&&wm.getPassword()!=null&&wm.getPassword().equals(password)) {	
			HttpSession session=request.getSession();
				session.setAttribute("user", wm);
				return "home";
			}
			else {
				return "login";
				
			}
		} 
		
	}



