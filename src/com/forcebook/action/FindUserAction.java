package com.forcebook.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.forcebook.dao.FindUserDAO;
import com.forcebook.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class FindUserAction extends ActionSupport implements SessionAware {

	private Map<String, Object> sessionMap;
	private String targetText;

	public String execute(){
		System.out.println("FindUserAction - execute");


		if(this.targetText != null){

			int id = (int)sessionMap.get("id");
			FindUserDAO dao = new FindUserDAO();
			List<UserDTO> arrayDTO = dao.findUser(targetText,id);

			if(arrayDTO == null){
				System.out.println("LoginAction - error");
				return "error";
			}
		}

		System.out.println("LoginAction - success");
		return "success";
	}



	public String getTargetText() {
		return targetText;
	}

	public void setTargetText(String targetText) {
		this.targetText = targetText;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}

}
