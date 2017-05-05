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

import com.framework.admin.model.RoleInfo;
import com.framework.admin.service.RoleInfoService;
import com.framework.admin.web.req.RoleInfoAddReq;
import com.framework.admin.web.req.RoleInfoQueryReq;
import com.framework.admin.web.req.RoleInfoUpdateReq;
import com.framework.common.crud.Result;
import com.framework.common.exception.BusinessException;
import com.framework.common.http.ApiResult;

@RestController
@RequestMapping("/role")
public class RoleInfoController {

	@Autowired
	private RoleInfoService roleInfoService;
	
	@RequestMapping(value="/query", method=RequestMethod.POST )
	public Result query(final RoleInfoQueryReq req){
		return new ApiResult() {
			@Override
			public void doSomething() throws BusinessException {
				
				Map<String, Object> paraMap = new HashMap<String, Object>();
				paraMap.put("code", req.getCode());
				paraMap.put("name", req.getName());
				
				List<RoleInfo> list = roleInfoService.query(paraMap);
				this.putData(list);
			}
		};
	}
	
	
	@RequestMapping(value="/get/{id}", method=RequestMethod.POST )
	public ApiResult get(final @PathVariable("id") Integer id){
		return new ApiResult() {
			@Override
			public void doSomething() throws BusinessException {
				RoleInfo roleInfo = roleInfoService.get(id);
				this.putData(roleInfo);
			}
		};
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST )
	public Result add(final RoleInfoAddReq req){
		return new ApiResult() {
			@Override
			public void doSomething() throws BusinessException {
				RoleInfo roleInfo = new RoleInfo();
				BeanUtils.copyProperties(req, roleInfo);
				
				roleInfoService.add(roleInfo);
			}
		};
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST )
	public Result update(final RoleInfoUpdateReq req){
		return new ApiResult() {
			@Override
			public void doSomething() throws BusinessException {
				RoleInfo roleInfo = new RoleInfo();
				BeanUtils.copyProperties(req, roleInfo);
				
				roleInfoService.update(roleInfo);
			}
		};
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST )
	public Result delete(final Integer[] ids){
		return new ApiResult() {
			@Override
			public void doSomething() throws BusinessException {
				
				roleInfoService.delete(ids);
			}
		};
	}
}
