package com.framework.common.http;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.framework.common.crud.Result;
import com.framework.common.exception.BaseErrorEnum;
import com.framework.common.exception.BusinessException;

public abstract class ApiResult extends Result {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public ApiResult() {
		instance();
	}
	
	private ApiResult instance(){
		try {
			before();
			doSomething();
			
			this.code = BaseErrorEnum.OK.getCode();
			this.msg = BaseErrorEnum.OK.getMsg();
		} catch (BusinessException e) {
			logger.error("Throw business exception：", e);
			this.code = e.getCode();
			this.msg = e.getMsg();
		} catch (Exception e) {
			logger.error("Throw other exception(exclude business exception)：", e);
			this.code = BaseErrorEnum.E1_SYSTEM_ERROR.getCode();
			this.msg = e.getMessage() == null ? new Date().toString() + ": " + e.getClass() : e.getMessage();
		}
		
		return this;
	}

	public void before() throws BusinessException {

	}

	public abstract void doSomething() throws BusinessException;

}
