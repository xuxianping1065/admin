package com.framework.common.http;

import java.util.Date;

import com.framework.common.crud.Result;
import com.framework.common.exception.BaseErrorEnum;
import com.framework.common.exception.BusinessException;

public abstract class HttpTemplate<T extends Result> {


	private T resp = null;
	private Object data = null;
	
	public HttpTemplate(Class<T> clazz) {
		try {
			resp = clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void before() throws BusinessException {

	}

	public abstract void doSomething() throws BusinessException;

	public T operate() {
		try {
			before();
			doSomething();
			
		} catch (BusinessException e) {
			e.printStackTrace();
			resp.setCode(e.getCode());
			resp.setMsg(e.getMsg());
		} catch (Exception e) {
			e.printStackTrace();
			resp.setCode(BaseErrorEnum.E1_SYSTEM_ERROR.getCode());
			resp.setMsg(e.getMessage() == null ? new Date().toString() + ": " + e.getClass() : e.getMessage());
		}
		return resp;
	}

	public T getResp() {
		return resp;
	}

	public void setResp(T resp) {
		this.resp = resp;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
