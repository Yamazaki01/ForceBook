package com.forcebook.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class JsonAction extends ActionSupport implements SessionAware {

	private Map<String, Object> sessionMap;
    private HashMap<String,String> msg;

	public String execute(){

  	    HashMap<String,String> map = new HashMap<String,String>();
  	    map.put("english","Hello World");
  	    map.put("japanese","ようこそ世界");

  	    setMsg(map);
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}

	public Map<String, Object> getSessionMap() {
		return sessionMap;
	}

	public void setSessionMap(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	public HashMap<String, String> getMsg() {
		return msg;
	}

	public void setMsg(HashMap<String, String> msg) {
		this.msg = msg;
	}



}
