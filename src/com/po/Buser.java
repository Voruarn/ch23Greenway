package com.po;

public class Buser {
	private Integer id;
	private String companyName;
	private String userName;
	private String userTel;
	private String userEmail;
	private String userQQ;
	private String userpwd;
	private String message;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCompanyName(){
		return companyName;
	}
	
	public void setCompanyName(String cn) {
		this.companyName=cn;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String un) {
		this.userName=un;
	}
	
	public String getUserTel() {
		return userTel;
	}
	
	public void setUserTel(String ut) {
		this.userTel=ut;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	
	public void setUserEmail(String ue) {
		this.userEmail=ue;
	}
	
	public String getUserQQ() {
		return userQQ;
	}
	
	public void setUserQQ(String uq) {
		this.userQQ=uq;
	}
	
	public String getUserpwd() {
		return userpwd;
	}
	
	public void setUserpwd(String up) {
		this.userpwd=up;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String msg) {
		this.message=msg;
	}
	
}
