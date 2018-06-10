package com.forcebook.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.forcebook.dao.UserDAO;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterCompletAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	public String execute(){

		String user_name = (String)session.get("user_name");
		String user_pass = (String)session.get("user_pass");
		String user_mail = (String)session.get("user_mail");

		System.out.println("RegisterCompletAction - execute");
		if(user_name != null && user_pass != null && user_mail != null){
			UserDAO dao = new UserDAO();
			int result = dao.user_insert(user_name, user_pass, user_mail);

			this.session.put("user_name", user_name);
			if(0 < result){
				System.out.println("RegisterComplet - success");
				return "success";
			}
		}

		System.out.println("RegisterComplet - error");
		return "error";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
