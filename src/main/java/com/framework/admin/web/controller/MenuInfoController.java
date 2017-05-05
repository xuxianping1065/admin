package com.framework.admin.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.framework.admin.model.MenuInfo;
import com.framework.admin.service.MenuInfoService;
import com.framework.admin.web.req.MenuInfoAddReq;
import com.framework.admin.web.req.MenuInfoQueryReq;
import com.framework.admin.web.req.MenuInfoUpdateReq;
import com.framework.common.crud.Result;
import com.framework.common.exception.BusinessException;
import com.framework.common.http.HttpTemplate;

@RestController
@RequestMapping("/menu")
public class MenuInfoController {

	@Autowired
	private MenuInfoService menuInfoService;
	
	@RequestMapping(value="/query", method=RequestMethod.POST )
	public Result query(MenuInfoQueryReq req){
		Map<String, Object> paraMap = new HashMap<String, Object>();
		List<MenuInfo> list = menuInfoService.query(paraMap);
		
		return Result.ok().putData(list);
	}
	
	@RequestMapping(value="/get/{id}", method=RequestMethod.POST )
	public Result get(@PathVariable("id") Integer id){
		MenuInfo menuInfo = menuInfoService.get(id);
		
		return Result.ok().putData(menuInfo);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST )
	public Result add(final MenuInfoAddReq req){
		HttpTemplate<Result> template  = new HttpTemplate<Result>(Result.class) {
			@Override
			public void doSomething() throws BusinessException {
				MenuInfo menuInfo = new MenuInfo();
				BeanUtils.copyProperties(req, menuInfo);
				
				menuInfoService.add(menuInfo);
			}
		};
		
		return template.operate();
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST )
	public Result update(MenuInfoUpdateReq req){
		MenuInfo menuInfo = new MenuInfo();
		BeanUtils.copyProperties(req, menuInfo);
		
		menuInfoService.update(menuInfo);
		return Result.ok();
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST )
	public Result delete(Integer[] ids){
		
		menuInfoService.delete(ids);
		
		return Result.ok();
	}
}
