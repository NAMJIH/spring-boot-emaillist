<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>추가하기</h1>
	<form action="/emaillist03/add" method="post">
		성:<input type="text" name="firstName">
		<br>
		이름:<input type="text" name="lastName">
		<br>
		이메일:<input type="text" name="email">
		<br>
		<input type="submit" value="등록">
	</form>
</body>
</html>