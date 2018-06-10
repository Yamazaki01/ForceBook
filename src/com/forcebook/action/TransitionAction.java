package com.forcebook.action;

import com.opensymphony.xwork2.ActionSupport;

public class TransitionAction extends ActionSupport {

	public String execute() throws Exception {
		System.out.println("TransitionAction - execute");
		return "success";
	}
}
