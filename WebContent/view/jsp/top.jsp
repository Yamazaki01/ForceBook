<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>トップページ</title>
</head>
<body>
	<div>
		<form action="logout" method="GET">
			<button type="submit" value="ログアウト">ログアウト</button>
		</form>
	</div>

	<br />
	<br />
	<div>
		ようこそ、
		<s:property value="#session.user_name" />
		さん
	</div>
	<br />
	<br />
	<br />
	<br />
	<br />
	<form action="tweet" method="post" enctype="multipart/form-data">
		<div>
			<input type="file" name="myfile" /> <input type="submit" />
		</div>
	</form>

	<br />
	<br />
	<br />
	<br />
	<br />

	<s:form action="tweet" method="post" enctype="multipart/form-data">
		<s:file name="myfile" id="button3" label="File" />
		<input type="submit" />
	</s:form>

	<br />
	<br />
	<br />
	<br />
	<br />


	<s:form action="tweet" enctype="multipart/form-data"
		method="post">
		<s:file name="myfile" label="選択" />
		<s:submit value="submit" />
	</s:form>


</body>
</html>