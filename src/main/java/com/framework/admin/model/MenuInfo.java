package com.framework.admin.model;

import java.util.Date;

/**
* 菜单表
*/
public class MenuInfo {

	/**
	*	ID
	*/
	private Integer id;
	
	/**
	*	菜单名称
	*/
	private String name;
	
	/**
	*	菜单编码
	*/
	private String code;
	
	/**
	*	菜单类型 1:目录  2:菜单 3:按钮 4：url
	*/
	private String type;
	
	/**
	*	菜单相对路径URL
	*/
	private String url;
	
	/**
	*	菜单图标
	*/
	private String icon;
	
	/**
	*	显示顺序
	*/
	private Integer position;
	
	/**
	*	所属系统
	*/
	private String platform;
	
	/**
	*	级别
	*/
	private Integer level;
	
	/**
	*	父菜单ID
	*/
	private Integer parentId;
	
	/**
	*	是否显示
	*/
	private String display;
	
	/**
	*	创建人ID
	*/
	private Integer createrId;
	
	/**
	*	创建时间
	*/
	private Date createDate;
	
	/**
	*	修改人ID
	*/
	private Integer updaterId;
	
	/**
	*	修改时间
	*/
	private Date updateDate;
	
	/**
	*	时间戳
	*/
	private Date flag;
	
	/**
	*	状态
	*/
	private String state;
	

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

	public String getType(){
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl(){
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon(){
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getPosition(){
		return position;
	}
	
	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getPlatform(){
		return platform;
	}
	
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Integer getLevel(){
		return level;
	}
	
	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getParentId(){
		return parentId;
	}
	
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getDisplay(){
		return display;
	}
	
	public void setDisplay(String display) {
		this.display = display;
	}

	public Integer getCreaterId(){
		return createrId;
	}
	
	public void setCreaterId(Integer createrId) {
		this.createrId = createrId;
	}

	public Date getCreateDate(){
		return createDate;
	}
	
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getUpdaterId(){
		return updaterId;
	}
	
	public void setUpdaterId(Integer updaterId) {
		this.updaterId = updaterId;
	}

	public Date getUpdateDate(){
		return updateDate;
	}
	
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
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