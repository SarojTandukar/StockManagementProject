<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored = "false" %>
    
    <%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>User Information</h1>

First Name : ${user.firstName}

Last Name : ${user.lastName}

Gender : ${user.gender}

<ul>

<c:forEach items="${user.courses} " var="course">

<li> ${course}</li>

</c:forEach>
</ul>

Leaving From : ${user.cityFrom }<br>
Going To : ${user.cityTo}

</body>
</html>