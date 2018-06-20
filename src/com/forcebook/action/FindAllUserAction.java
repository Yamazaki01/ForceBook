package com.forcebook.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.forcebook.dao.FindUserDAO;
import com.forcebook.dto.FindAllUserDTO;
import com.opensymphony.xwork2.ActionSupport;

import tool.Utils;

public class FindAllUserAction extends ActionSupport implements SessionAware {

	private String targetText;
	private List<FindAllUserDTO> userList = null;
	private HashMap<String, List<FindAllUserDTO>> msg;
	private Map<String, Object> sessionMap;

	public String execute() {
		System.out.println("FindUserAction - execute");
		if (this.targetText == null) {
			return SUCCESS;
		}

		int id = (int)sessionMap.get("id");
		Utils util = new Utils();
		if (id != 0) {
//			int id = Integer.parseInt(str_id);

			FindUserDAO dao = new FindUserDAO();
			userList = dao.findAllUser(targetText, id);
			if (userList.size() != 0) {
				HashMap<String, List<FindAllUserDTO>> map = new HashMap<String, List<FindAllUserDTO>>();
				map.put("data", userList);
				setMsg(map);
				System.out.println("json");
				return "json";
			}
		}
		System.out.println("FindUserAction - success");
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}

	public List<FindAllUserDTO> getUserList() {
		return userList;
	}

	public String getTargetText() {
		return targetText;
	}

	public void setTargetText(String targetText) {
		this.targetText = targetText;
	}

	public HashMap<String, List<FindAllUserDTO>> getMsg() {
		return msg;
	}

	public void setMsg(HashMap<String, List<FindAllUserDTO>> msg) {
		this.msg = msg;
	}


}
