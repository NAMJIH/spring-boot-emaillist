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
	<h1>Emaillist</h1>
	<a href="/emaillist03/form">추가하기</a>

	<c:forEach items="${list }" var="vo">
		<table border="1">
			<tr>
				<td>성</td>
				<td>${vo.firstName }</td>
			</tr>
			<tr>
				<td>이름</td>
				<td>${vo.lastName }</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>${vo.email }</td>
			</tr>
		</table>
		<br>
	</c:forEach>
</body>
</html>