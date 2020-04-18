package com.shopping.demo.sec;

public class JWTResponse {
	
	private String token ;
	private String userName ;
	private String roles ;
	private String status ;
	
	
	public JWTResponse(String token, String userName, String roles , String status) {
		this.status = status;
		this.token = token;
		this.userName = userName;
		this.roles = roles;
	}


	public JWTResponse() {
		
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getRoles() {
		return roles;
	}


	public void setRoles(String roles) {
		this.roles = roles;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	

}
