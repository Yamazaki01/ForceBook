package com.forcebook.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.forcebook.dao.UserDAO;
import com.forcebook.dtd.UserDTD;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction  extends ActionSupport implements SessionAware{

//	private Logger logger = LogManager.getLogger(LoginAction.class);

	private String user_name;
	private String user_pass;
	private Map<String, Object> session;


	public String execute() throws Exception {
		System.out.println("LoginAction - execute");
		UserDAO dao = new UserDAO();
		UserDTD dtd = dao.user_serch(user_name, user_pass);

		this.session.put("user_name", this.user_name);

		if(dtd != null){
			this.session.put("user_id", dtd.getId());
			System.out.println("LoginAction - success");
			return "success";
		}

		System.out.println("LoginAction - error");
		return "error";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
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



}
