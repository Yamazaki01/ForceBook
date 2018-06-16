<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Struts2のタグライブラリを使用可能にする -->
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- タイプ宣言はHTML5のものを使用する -->
<!DOCTYPE html>
<html>
    <head>
		<%@ include file="../html/head.html" %>
        <title>login</title>
    </head>
    <body>
		<%@ include file="../html/header.jsp" %>
		<br/>
		<h2>ログイン</h2>
        <form action="login" method="post">
           	<table>
            <tr>
				<td align="right" nowrap>ユーザ：</td>
            	<td valign="top" width="200">
            		<input type="text" id="user_name" name="user_name" value="<s:property value="#session.user_name" />" width="200" />
            	</td>
            </tr>
            <tr>
            	<td align="right" nowrap>パスワード：</td>
	            <td valign="top" width="200">
	            	<input type="password" id="user_pass" name="user_pass" width="200" />
				</td>
			</tr>
			<tr>
				<td align="right"></td>
				<td valign="top">
					<button type="submit" value="ログイン" >ログイン</button>
				</td>
			</tr>
      		</table>
        </form>


		<br/>
		<br/>
        <form action="register" method="get">
        	<div><button type="submit" value="新規作成" >新規作成</button></div>
        </form>
		 </div>
		<%@ include file="../html/footer.html" %>

    </body>
</html>