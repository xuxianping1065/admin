package com.framework.common.exception;

public enum BaseErrorEnum {
	/**
	 * 正确
	 */
	OK("0", "OK"),
	
	E1_SYSTEM_ERROR("1", "系统错误");
	
	private String code;
	private String msg;
	
	private BaseErrorEnum(String code, String msg){
		this.code = code;
		this.msg = msg;
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
