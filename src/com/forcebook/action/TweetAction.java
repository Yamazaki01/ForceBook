package com.forcebook.action;

import java.io.File;
import java.util.Map;

//import org.apache.struts2.dispatcher.Parameter.File;
//import org.apache.struts2.components.File;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class TweetAction extends ActionSupport implements SessionAware {

	private Map<String, Object> sessionMap;
//	private static final long serialVersionUID = 1L;
	private String user_name;
	private File myfile;
	private String myfileContentType;
	private String myfileFileName;


	public String execute() {
		System.out.println("TweetAction - execute");
		System.out.println(this.myfileFileName);
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

	public File getMyfile() {
		return myfile;
	}

	public void setMyfile(File myfile) {
		this.myfile = myfile;
	}

	public String getMyfileContentType() {
		return myfileContentType;
	}

	public void setMyfileContentType(String myfileContentType) {
		this.myfileContentType = myfileContentType;
	}

	public String getMyfileFileName() {
		return myfileFileName;
	}

	public void setMyfileFileName(String myfileFileName) {
		this.myfileFileName = myfileFileName;
	}


}
