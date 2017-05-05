package com.framework.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.framework.admin.mapper.UserInfoMapper;
import com.framework.admin.model.UserInfo;
import com.framework.admin.service.UserInfoService;
import com.framework.common.crud.AbstractCommonServiceImpl;
import com.framework.common.crud.CommonMapper;

@Service
public class UserInfoServiceImpl extends AbstractCommonServiceImpl<UserInfo> implements UserInfoService{

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	protected CommonMapper<UserInfo> getBaseMapper() {
		return userInfoMapper;
	}

}