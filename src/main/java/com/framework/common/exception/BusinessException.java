package com.framework.common.exception;

/**
 * 业务异常
 *@author xuxianping
 */
public class BusinessException extends Exception{
	private static final long serialVersionUID = -6526995106398499927L;

	/**
	 * 错误码
	 */
	private String code;
	
	/**
	 * 错误信息
	 */
	private String msg;

	public BusinessException() {
		super();
	}

	public BusinessException(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public BusinessException(BaseErrorEnum errorEnum){
		this.code = errorEnum.getCode();
		this.msg = errorEnum.getMsg();
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
