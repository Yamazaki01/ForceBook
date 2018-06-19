package com.forcebook.action;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.SessionAware;

import com.forcebook.dao.FindUserDAO;
import com.forcebook.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class FindUserAction extends ActionSupport implements SessionAware {

	private int profileId;
	private UserDTO dto=null;
	private Map<String, Object> sessionMap;

	@Resource
	protected Map requestScope;


	public String execute(){

		String url=(String)requestScope.get("javax.servlet.forward.servlet_uri");

//		String url = RequestUtil.getRequest().getRequestURI();
		FindUserDAO dao = new FindUserDAO();
		dto = dao.findUser(profileId);

		if(dto != null){
			return "success";
		}
		return "error";
	}


	public int getProfileId() {
		return profileId;
	}
	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public UserDTO getDto() {
		return dto;
	}
	public void setDto(UserDTO dto) {
		this.dto = dto;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}

}
