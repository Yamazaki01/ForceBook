<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
<ul id="normal" class="dropmenu">
  <li><a href="/ForceBook/top">Forcebook</a></li>

  <li><a href="#">menu</a>
    <ul>
      <li><a href="/ForceBook/search">ユーザ検索</a></li>
      <li><a href="#">submenu</a></li>
      <li><a href="#">submenu</a></li>
      <li><a href="#"></a></li>
    </ul>
  </li>
  <li><a href="#"><s:property value="#session.user_name" /></a>
    <ul>
      <li><a href="ForceBook/logout">ログアウト</a></li>
    </ul>
  </li>
</ul>
</div>