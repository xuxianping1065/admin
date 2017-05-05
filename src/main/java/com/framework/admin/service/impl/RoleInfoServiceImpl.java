package com.framework.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.framework.admin.mapper.RoleInfoMapper;
import com.framework.admin.model.RoleInfo;
import com.framework.admin.service.RoleInfoService;
import com.framework.common.crud.AbstractCommonServiceImpl;
import com.framework.common.crud.CommonMapper;

@Service
public class RoleInfoServiceImpl extends AbstractCommonServiceImpl<RoleInfo> implements RoleInfoService{

	@Autowired
	private RoleInfoMapper roleInfoMapper;
	
	@Override
	protected CommonMapper<RoleInfo> getBaseMapper() {
		return roleInfoMapper;
	}

}
