<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>アカウント作成 - 確認</title>
</head>
<body>
	<h2>新規アカウント作成</h2>
	<form action="confirm" method="post">
		<table>
			<tr>
				<td align="right" nowrap>ユーザ名：</td>
				<td valign="top"><% %></td>
			</tr>
			<tr>
				<td align="right" nowrap>メールアドレス：</td>
				<td valign="top"></td>
			</tr>
			<tr>
				<td align="right" nowrap>パスワード：</td>
				<td valign="top"></td>
			</tr>
			<tr>
				<td align="right" nowrap>パスワード(確認用)：</td>
				<td valign="top"></td>
			</tr>
			<tr>
				<td align="right"></td>
				<td valign="top">
					<button type="submit" value="アカウント登録">アカウント登録</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>