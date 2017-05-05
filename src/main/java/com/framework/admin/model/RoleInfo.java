package com.framework.admin.model;

import java.util.Date;

/**
* 角色信息表
*/
public class RoleInfo {

	/**
	*	ID
	*/
	private Integer id;
	
	/**
	*	角色名称
	*/
	private String name;
	
	/**
	*	角色代码
	*/
	private String code;
	
	/**
	*	角色描述
	*/
	private String description;
	
	/**
	*	是否前台显示
	*/
	private String display = "1";
	
	/**
	*	所属系统
	*/
	private String platform;
	
	/**
	*	创建时间
	*/
	private Date createDate;
	
	/**
	*	修改时间
	*/
	private Date updateDate;
	
	/**
	*	创建人ID
	*/
	private Integer createrId;
	
	/**
	*	修改人ID
	*/
	private Integer updaterId;
	
	/**
	*	时间戳
	*/
	private Date flag;
	
	/**
	*	状态
	*/
	private String state = "1";
	

	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getCode(){
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplay(){
		return display;
	}
	
	public void setDisplay(String display) {
		this.display = display;
	}

	public String getPlatform(){
		return platform;
	}
	
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Date getCreateDate(){
		return createDate;
	}
	
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate(){
		return updateDate;
	}
	
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getCreaterId(){
		return createrId;
	}
	
	public void setCreaterId(Integer createrId) {
		this.createrId = createrId;
	}

	public Integer getUpdaterId(){
		return updaterId;
	}
	
	public void setUpdaterId(Integer updaterId) {
		this.updaterId = updaterId;
	}

	public Date getFlag(){
		return flag;
	}
	
	public void setFlag(Date flag) {
		this.flag = flag;
	}

	public String getState(){
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}

}