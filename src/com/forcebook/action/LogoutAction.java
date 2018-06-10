package com.forcebook.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	private Map<String, Object> sessionMap;

	public String execute(){
		System.out.println("LogoutAction - execute");
		((SessionMap<String, Object>)sessionMap).invalidate();
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}

}
