<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="cnt" scope="session" class="bean.SampleBean"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bean Counter</title>
</head>
<body>
	<h1>Beanの機能を利用したカウンター</h1>
	<h2><jsp:getProperty name="cnt" property="count"/>回目のアクセスです。</h2>
</body>
</html>