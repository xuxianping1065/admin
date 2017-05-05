package com.framework.admin.model;

import java.util.Date;

/**
* 用户信息表
*/
public class UserInfo {

	/**
	*	id
	*/
	private Integer id;
	
	/**
	*	用户名
	*/
	private String username;
	
	/**
	*	昵称
	*/
	private String nickname;
	
	/**
	*	真实姓名
	*/
	private String realname;
	
	/**
	*	密码
	*/
	private String password;
	
	/**
	*	安全码
	*/
	private String salt;
	
	/**
	*	手机
	*/
	private String mobile;
	
	/**
	*	邮件
	*/
	private String email;
	
	/**
	*	是否初始密码
	*/
	private String isOriginalPassword;
	
	/**
	*	密码加密方式
	*/
	private String passwordWay;
	
	/**
	*	登录错误次数
	*/
	private Integer loginErrorNum;
	
	/**
	*	登录错误时间
	*/
	private Date loginErrorDate;
	
	/**
	*	头像路径
	*/
	private String iconPath;
	
	/**
	*	用户一级分类
	*/
	private String oneType;
	
	/**
	*	用户二级分类
	*/
	private String twoYpe;
	
	/**
	*	用户一级来源
	*/
	private String oneSource;
	
	/**
	*	用户二级来源
	*/
	private String twoSource;
	
	/**
	*	注册时间
	*/
	private Date registerTime;
	
	/**
	*	注册IP地址
	*/
	private String registerIp;
	
	/**
	*	注册客户端类型（1：ios 2：android 3：web网站  4：微信）
	*/
	private String registerClient;
	
	/**
	*	最后登录时间
	*/
	private Date lastLoginTime;
	
	/**
	*	最后登录IP地址
	*/
	private String lastLoginIp;
	
	/**
	*	安全密码
	*/
	private String securityPassword;
	
	/**
	*	安全密码安全码
	*/
	private String securitySalt;
	
	/**
	*	安全密码加密方式
	*/
	private String securityPasswordWay;
	
	/**
	*	安全密码验证错误次数
	*/
	private Integer securityPasswordErrorNum;
	
	/**
	*	安全密码验证错误时间
	*/
	private Date securityPasswordErrorDate;
	
	/**
	*	证件类型 [1:身份证]
	*/
	private String cardType;
	
	/**
	*	证件号
	*/
	private String cardNo;
	
	/**
	*	性别（1：男 2：女）
	*/
	private String sex;
	
	/**
	*	
	*/
	private String birthday;
	
	/**
	*	经度
	*/
	private Double longitude;
	
	/**
	*	纬度
	*/
	private Double latitude;
	
	/**
	*	手机设备号
	*/
	private String mobileNo;
	
	/**
	*	推荐人
	*/
	private Integer referrer;
	
	/**
	*	推荐码
	*/
	private String referralCode;
	
	/**
	*	服务授权码
	*/
	private String serviceAuth;
	
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

	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname(){
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRealname(){
		return realname;
	}
	
	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt(){
		return salt;
	}
	
	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getMobile(){
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getIsOriginalPassword(){
		return isOriginalPassword;
	}
	
	public void setIsOriginalPassword(String isOriginalPassword) {
		this.isOriginalPassword = isOriginalPassword;
	}

	public String getPasswordWay(){
		return passwordWay;
	}
	
	public void setPasswordWay(String passwordWay) {
		this.passwordWay = passwordWay;
	}

	public Integer getLoginErrorNum(){
		return loginErrorNum;
	}
	
	public void setLoginErrorNum(Integer loginErrorNum) {
		this.loginErrorNum = loginErrorNum;
	}

	public Date getLoginErrorDate(){
		return loginErrorDate;
	}
	
	public void setLoginErrorDate(Date loginErrorDate) {
		this.loginErrorDate = loginErrorDate;
	}

	public String getIconPath(){
		return iconPath;
	}
	
	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}

	public String getOneType(){
		return oneType;
	}
	
	public void setOneType(String oneType) {
		this.oneType = oneType;
	}

	public String getTwoYpe(){
		return twoYpe;
	}
	
	public void setTwoYpe(String twoYpe) {
		this.twoYpe = twoYpe;
	}

	public String getOneSource(){
		return oneSource;
	}
	
	public void setOneSource(String oneSource) {
		this.oneSource = oneSource;
	}

	public String getTwoSource(){
		return twoSource;
	}
	
	public void setTwoSource(String twoSource) {
		this.twoSource = twoSource;
	}

	public Date getRegisterTime(){
		return registerTime;
	}
	
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getRegisterIp(){
		return registerIp;
	}
	
	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	public String getRegisterClient(){
		return registerClient;
	}
	
	public void setRegisterClient(String registerClient) {
		this.registerClient = registerClient;
	}

	public Date getLastLoginTime(){
		return lastLoginTime;
	}
	
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIp(){
		return lastLoginIp;
	}
	
	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getSecurityPassword(){
		return securityPassword;
	}
	
	public void setSecurityPassword(String securityPassword) {
		this.securityPassword = securityPassword;
	}

	public String getSecuritySalt(){
		return securitySalt;
	}
	
	public void setSecuritySalt(String securitySalt) {
		this.securitySalt = securitySalt;
	}

	public String getSecurityPasswordWay(){
		return securityPasswordWay;
	}
	
	public void setSecurityPasswordWay(String securityPasswordWay) {
		this.securityPasswordWay = securityPasswordWay;
	}

	public Integer getSecurityPasswordErrorNum(){
		return securityPasswordErrorNum;
	}
	
	public void setSecurityPasswordErrorNum(Integer securityPasswordErrorNum) {
		this.securityPasswordErrorNum = securityPasswordErrorNum;
	}

	public Date getSecurityPasswordErrorDate(){
		return securityPasswordErrorDate;
	}
	
	public void setSecurityPasswordErrorDate(Date securityPasswordErrorDate) {
		this.securityPasswordErrorDate = securityPasswordErrorDate;
	}

	public String getCardType(){
		return cardType;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardNo(){
		return cardNo;
	}
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getSex(){
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday(){
		return birthday;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Double getLongitude(){
		return longitude;
	}
	
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude(){
		return latitude;
	}
	
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getMobileNo(){
		return mobileNo;
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Integer getReferrer(){
		return referrer;
	}
	
	public void setReferrer(Integer referrer) {
		this.referrer = referrer;
	}

	public String getReferralCode(){
		return referralCode;
	}
	
	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}

	public String getServiceAuth(){
		return serviceAuth;
	}
	
	public void setServiceAuth(String serviceAuth) {
		this.serviceAuth = serviceAuth;
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