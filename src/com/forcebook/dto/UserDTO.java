package com.forcebook.dto;

public class UserDTO implements java.io.Serializable {

	private int id;
	private String user_name;
	private String user_pass;
	private String user_open_nickname;
	private String user_mail;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public String getUser_open_nickname() {
		return user_open_nickname;
	}
	public void setUser_open_nickname(String user_open_nickname) {
		this.user_open_nickname = user_open_nickname;
	}
	public String getUser_mail() {
		return user_mail;
	}
	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}


}
