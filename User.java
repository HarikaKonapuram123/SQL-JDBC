package com.edu.model;


	public class User {

		private int userId;
		private String userName;
		private String password;
	public User() {
		
	}
	public User(int userId, String UserName,String password, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}
	public int getuserId() {
		return userId;
	}
	public void setuserId(int userId) {
		this.userId = userId;
	}
	public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";

	}


		
}
