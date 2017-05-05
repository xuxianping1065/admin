package com.framework.common.crud;

import java.util.HashMap;

import com.alibaba.druid.util.StringUtils;
import com.framework.admin.Constants;
import com.framework.common.exception.BaseErrorEnum;

/**
 * 返回结果基本类
 * 
 */
public class Result extends HashMap<String, Object>{

	/**
	 * 返回码 
	 */
	protected String code;
	
	/**
	 * 返回信息
	 */
	protected String msg;
	
	public Result() {
		if( StringUtils.isEmpty(code) ){
			this.put("code", BaseErrorEnum.OK.getCode());
			this.put("msg", BaseErrorEnum.OK.getMsg());
		}else{
			this.put("code", code);
			this.put("msg", msg);
		}
	}
	
	public Result(String code, String msg) {
		this.put("code", code);
		this.put("msg", msg);
	}
	
	public Result(BaseErrorEnum errorEnum) {
		this.put("code", errorEnum.getCode());
		this.put("msg", errorEnum.getMsg());
	}
	
	/**
	 * 创建一个成功的返回结果
	 * @return
	 */
	public static Result ok(){
		return new Result(Constants.SUC_CODE, Constants.SUC_MSG);
	}
	
	/**
	 * 存入key为"data"的值
	 * @param obj
	 * @return
	 */
	public Result putData(Object obj){
		this.put("data", obj);
		
		return this;
	}
	
	/**
	 * 创建一个成功的返回结果
	 * @return
	 */
	public static Result ok(String msg){
		return new Result(Constants.SUC_CODE, msg);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
