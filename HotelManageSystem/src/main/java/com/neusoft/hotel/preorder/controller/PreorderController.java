package com.neusoft.hotel.preorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.hotel.preorder.service.IPreorderService;
import com.sun.net.httpserver.Authenticator.Result;

@RestController
@RequestMapping(value="/preorder")
@CrossOrigin(origins= {"*","null"})
public class PreorderController{
	
	@Autowired
	private IPreorderService ps=null;
	

}
