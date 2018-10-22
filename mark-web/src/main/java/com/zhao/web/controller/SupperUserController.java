package com.zhao.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhao.service.api.SupperUserService;
import com.zhao.service.pojo.Supperuser;


@Controller
@RequestMapping("supperUser")
public class SupperUserController {
	@Autowired
	private SupperUserService suService;
	@RequestMapping("showSupperUser")
	@ResponseBody
	public List<Supperuser> showSupperUser(){
		List<Supperuser> supperUsers = suService.getUserAll();
		return supperUsers;
	}
	
}
