<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登録完了</title>
</head>
<body>
	<div><h3>ユーザID「<s:property value="#session.user_name" />」で登録が完了しました。</h3></div>
	<br/>
	<div>
		<a href="/ForceBook/">ログイン画面へ</a>
	</div>
</body>
</html>