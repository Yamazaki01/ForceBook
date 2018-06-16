package com.forcebook.action;

import java.io.File;
import java.util.Map;

//import org.apache.struts2.components.File;
//import org.apache.struts2.dispatcher.Parameter.File;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import tool.ImageUploadModel;

public class ImageUploadAction extends ActionSupport implements SessionAware, ModelDriven<ImageUploadModel> {

	private File myfile;
	private String myfileContentType;
	private String myfileFileName;
	private Map<String, Object> sessionMap;

	private ImageUploadModel iuModel = new ImageUploadModel();

	public String execute() {
		myfile = iuModel.getMyfile();
		System.out.println(this.myfile);
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> session) {

		this.sessionMap = session;
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

	@Override
	public ImageUploadModel getModel() {
		return iuModel;
	}

}
