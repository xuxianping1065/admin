package com.framework.admin.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.framework.admin.model.UserInfo;
import com.framework.admin.service.UserInfoService;
import com.framework.common.crud.Result;

@RestController
@RequestMapping("/user")
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping("/get/{id}")
	public Result get(@PathVariable("id")Integer id){
		UserInfo userInfo = userInfoService.get(id);
		return Result.ok().putData(userInfo);
	}
	
	@RequestMapping("/delete")
	public Result delete(Integer[] ids){
		return Result.ok();
	}
}
