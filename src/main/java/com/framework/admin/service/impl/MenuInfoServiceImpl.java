package com.framework.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.framework.admin.mapper.MenuInfoMapper;
import com.framework.admin.model.MenuInfo;
import com.framework.admin.service.MenuInfoService;
import com.framework.common.crud.AbstractCommonServiceImpl;
import com.framework.common.crud.CommonMapper;

@Service
public class MenuInfoServiceImpl extends AbstractCommonServiceImpl<MenuInfo> implements MenuInfoService {

	@Autowired
	private MenuInfoMapper menuInfoMapper;
	
	@Override
	protected CommonMapper<MenuInfo> getBaseMapper() {
		return menuInfoMapper;
	}

}
