package com.tutorial.auth.dto;

public class AuthUserDto {

	private String userName;
	private String password;
	
	public AuthUserDto() {
		super();
	}
	
	public AuthUserDto(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
