<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>homepage</title>
	<head><link rel="stylesheet" type="text/css" href="<c:url value="css/kennel.css" />">

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <style>
    .table {
   margin: auto;
   width: 50%; 
}
    </style>
</head>
<body>
<div class="container">

    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h2>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>

    </c:if>

</div>
<div class="container">

	<a href="logout">Logout</a>
       

    

</div>
<div align="center">	
	<h1>Pet Details</h1>
	<div>
		<a href="new">Add Pet</a>
	</div>
	
	
	
	<br/><br/>	
	<table class="container">
		<thead>
			<tr>
				<th>Pet ID</th>
				<th>Name</th>
				<th>Age</th>
				<th>Place</th>
				<th>Buy</th>		
			</tr>
		</thead>
		<c:forEach var="pet" items="${plist}">
		<tbody>
		<tr>
			<td>${pet.petId}</td>
			<td>${pet.petName}</td>
			<td>${pet.petAge}</td>
			<td>${pet.petPlace}</td>
			
			
		</tr>
		</tbody>
		</c:forEach>
	</table>
</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>
