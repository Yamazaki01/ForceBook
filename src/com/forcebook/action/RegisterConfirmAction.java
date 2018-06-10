package com.forcebook.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterConfirmAction extends ActionSupport implements SessionAware {

	private Map<String, Object> sessionMap;

	private String user_name;
	private String user_mail;
	private String user_pass;
	private String user_pass_confirm;


	public String execute(){

		this.sessionMap.put("user_name", this.user_name);
		this.sessionMap.put("user_mail", this.user_mail);
		this.sessionMap.put("user_pass", this.user_pass);
		this.sessionMap.put("user_pass_confirm", this.user_pass_confirm);

		String userPass = this.user_pass;
		String userPassConfirm = this.user_pass_confirm;

		System.out.println(userPass +","+ userPassConfirm);
//		if(userPass == userPassConfirm){
		if(userPass != userPassConfirm){
			System.out.println("RegisterConfirmAction - error");
			return "error";
		}

		System.out.println("RegisterConfirmAction - success");
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_mail() {
		return user_mail;
	}

	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	public String getUser_pass_confirm() {
		return user_pass_confirm;
	}

	public void setUser_pass_confirm(String user_pass_confirm) {
		this.user_pass_confirm = user_pass_confirm;
	}




}
