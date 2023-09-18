<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<link rel="stylesheet" type="text/css" href="<c:url value="css/BUTTON.css" />">
<head>
<meta charset="UTF-8">
<title>Add new Pet</title>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="<c:url value="css/REGISTER.css" />">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</head>
<body>
	<style>
		.logout-link {
		  position: absolute;
		  top: 10px;
		  left: 10px;
		}
		</style>
		<div class="logout-link">
			<button onclick="location.href='logout'" class="custom-btn btn-16">Logout</button>
			
			<button onclick="location.href='home'" class="custom-btn btn-16">Homepage</button>
			
			
			<button onclick="location.href='personal'" class="custom-btn btn-16">My pets</button>
		  </div>
<div class="login">

	


<div align="center">	
		<h1>Add New Pet</h1>
		<br/>
	<form:form action="${pageContext.request.contextPath}/save" method="post" modelAttribute="petForm" novalidate="novalidate">
     <table>
			<tr>
				<td>Pet Name:</td>
				<td><form:input path="petName" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><form:input path="petAge" /></td>
				
			</tr>
			<tr>
				<td>Place:</td>
				<td><form:input path="petPlace" /></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Add Pet" /></td>
				<td><input type="reset" value="Cancel" /></td>
			</tr>
		</table>

      </form:form>
</div>

</body>
</html>
