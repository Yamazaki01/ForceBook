package tool;

//import org.apache.struts2.dispatcher.Parameter.File;

//import org.apache.struts2.components.File;

import java.io.File;

public class ImageUploadModel {
	private File myfile;
	private String myfileContentType;
	private String myfileFileName;
	private String myfileCaption;
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
	public String getMyfileCaption() {
		return myfileCaption;
	}
	public void setMyfileCaption(String myfileCaption) {
		this.myfileCaption = myfileCaption;
	}




}
