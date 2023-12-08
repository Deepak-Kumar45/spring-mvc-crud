<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add Student</title>
<link rel="stylesheet" href="/springmvc_CRUD/url_to_reach_resources/css/student.min.css">
</head>
<body class="body2">
	<div class="wrapper">
		<c:choose>
			<c:when test="${std!=null}">
				<h2>Edit details of Student</h2>
				<form action="updateStudent" method="post">
				<input type="text" placeholder="Enter your name" name="fakeId"
				value="${std.stdId}" hidden="true" required>
			</c:when>
			<c:otherwise>
				<h2>Fill details of Student</h2>
				<form action="saveStudent" method="post">
			</c:otherwise>
		</c:choose>
		<div class="input-box">
			<input type="text" placeholder="Enter your name" name="fakeName"
				value="${std.stdName}" required>
		</div>
		<div class="input-box">
			<input type="email" placeholder="Enter your email" name="fakeMail"
				value="${std.stdMail}" required>
		</div>
		<div class="input-box">
			<input type="text" placeholder="Enter mobile number" name="fakeMob"
				value="${std.stdMob}" required>
		</div>
		<div class="input-box">
			<input type="text" name="fakeCountry"
				placeholder="Enter country name" value="${std.country}" required>
		</div>
		<div class="policy">
			<input type="checkbox">
			<h3>I accept all terms & condition</h3>
		</div>
		<div class="input-box button">
			<input type="Submit" value="Save">
		</div>
		<div class="text">
			<h3>
				Want to see other students details? <a href="show-list">Show me</a>
			</h3>
		</div>
		</form>
	</div>
</body>
</html>