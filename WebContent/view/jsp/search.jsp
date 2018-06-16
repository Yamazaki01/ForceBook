<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../html/head.html" %>

<title>Forcebook - ユーザ検索</title>
</head>
<body>
<%@ include file="../html/header.jsp" %>

<h2>ユーザ検索</h2>
<br/>
<br/>

<div>
<form action="search" method="POST">
  <input type="text" name="targetText" value="" />
  <button type="submit" value="新規作成" >検索</button>

</form>
</div>

<br/>
<div>
  <table border="1">
	<tr>
	  <th>ユーザ</th>
	  <th></th>
	  <th></th>
	</tr>

	<tr>
	  <td>//ユーザ一覧表示箇所ダミー//</td>
	  <td>//ユーザ一覧表示箇所ダミー//</td>
	  <td>//ユーザ一覧表示箇所ダミー//</td>
	</tr>
	<tr>
	  <td>//ユーザ一覧表示箇所ダミー//</td>
	  <td>//ユーザ一覧表示箇所ダミー//</td>
	  <td>//ユーザ一覧表示箇所ダミー//</td>
	</tr>

  </table>
</div>

</body>
</html>