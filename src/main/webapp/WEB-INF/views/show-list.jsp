<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="/springmvc_CRUD/url_to_reach_resources/css/student.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet">

<title>Student Management System</title>

</head>
<body class="body1">

	<nav class="navbar navbar-dark bg-mynav">
		<div class="container-fluid">
			<div>
				<img alt="logo"
					src="/springmvc_CRUD/url_to_reach_resources/images/logo.webp"
					class="picstyle"> 
					<a class="navbar-brand" href="#"> Student
					Management System</a>
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="d-flex bd-highlight mb-3">
			<div class="me-auto p-2 bd-highlight">
				<h3>Student details</h3>
			</div>
			<div class="p-2 bd-highlight">
				<a href="show-form" type="button" class="btn btn-primary">Add
					new Student</a>
			</div>
		</div>

		<div class="table-responsive">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Student-ID</th>
						<th scope="col">Avatar</th>
						<th scope="col">Student Name</th>
						<th scope="col">Student Mobile</th>
						<th scope="col">E-Mail</th>
						<th scope="col">Country</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody id="mytable">
					<c:forEach var="student" items="${list}">
						<tr>
							<td>${student.stdId}</td>
							<td>Some Image</td>
							<td>${student.stdName}</td>
							<td>${student.stdMob}</td>
							<td>${student.stdMail}</td>
							<td>${student.country}</td>
							<td><a href="show-form-update?id=${student.stdId}"
								type="button" class="btn btn-outline-secondary">Update</a> <a
								href="deleteStd?id=${student.stdId}" type="button"
								class="btn btn-outline-danger"
								onclick="if(!confirm('Did your really wanna delete this record??'))return false;">Delete</a></td>

						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>
	</div>

	<script src="index.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/sweetalert2@11.0.16/dist/sweetalert2.all.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>