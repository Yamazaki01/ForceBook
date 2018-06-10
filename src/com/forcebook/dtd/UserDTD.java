package com.forcebook.dtd;

public class UserDTD implements java.io.Serializable {

	private int id;
	private String user_id;
	private String user_pass;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

}
