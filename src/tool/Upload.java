package tool;

import java.io.Serializable;

import org.apache.struts2.components.File;

public class Upload implements Serializable {
	private File myfile;
	private String itemImgContentType; // ←使わなかったら無くてもOK
	private String itemImgFileName; // ←使わなかったら無くてもOK
	private String fileCaption; //

	public File getMyfile() {
		return myfile;
	}

	public void setMyfile(File myfile) {
		this.myfile = myfile;
		System.out.println(this.myfile);
	}

	public String getItemImgContentType() {
		return itemImgContentType;
	}

	public void setItemImgContentType(String itemImgContentType) {
		this.itemImgContentType = itemImgContentType;
	}

	public String getItemImgFileName() {
		return itemImgFileName;
	}

	public void setItemImgFileName(String itemImgFileName) {
		this.itemImgFileName = itemImgFileName;
	}

	public String getFileCaption() {
		return fileCaption;
	}

	public void setFileCaption(String fileCaption) {
		this.fileCaption = fileCaption;
	}
}
