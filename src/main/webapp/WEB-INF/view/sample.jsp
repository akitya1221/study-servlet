<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
	<h1>Hello World</h1>
	<h2>セッションの勉強画面はこちら！</h2>
		<a href="/ServletSample/first">書籍管理</a>
	<h2><% out.println("JSPとServletの連携"); %></h2>
	<div class="login">
		<form action="/ServletSample/login" method="POST">
			<input type="text" name="user_name">
			<input type="password" name="password">
			<button type="submit">ログイン</button>
		</form>
	</div>
</body>
</html>