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
			<button type="submit" value="ログアウト" >ログアウト</button>
		</form>
	</div>

	<br/>
	<br/>
	<div>ようこそ、<s:property value="#session.user_name" />さん</div>

</body>
</html>