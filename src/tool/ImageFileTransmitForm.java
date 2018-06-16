package tool;

import java.io.File;

public class ImageFileTransmitForm {
	/** ファイル */
	private File uploadFile;
	/** ファイルの拡張子 */
	private String uploadFileContentType;
	/** ファイル名称 */
	private String uploadFileFileName;

	/**
	 * @return the uploadFile
	 */
	public File getUploadFile() {
		return uploadFile;
	}

	/**
	 * @param uploadFile
	 *            the uploadFile to set
	 */
	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	/**
	 * @return the uploadFileContentType
	 */
	public String getUploadFileContentType() {
		return uploadFileContentType;
	}

	/**
	 * @param uploadFileContentType
	 *            the uploadFileContentType to set
	 */
	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}

	/**
	 * @return the uploadFileFileName
	 */
	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	/**
	 * @param uploadFileFileName
	 *            the uploadFileFileName to set
	 */
	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

}