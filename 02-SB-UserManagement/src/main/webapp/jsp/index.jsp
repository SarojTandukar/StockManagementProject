<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@taglib prefix = "form" uri="http://www.springframework.org/tags/form"  %>
    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form action="insert" modelAttribute="user" method="post">

First Name : <form:input path="firstName"/><br><br>

Last Name : <form:input path="lastName"/><br><br>

Gender: Male<form:radiobutton path="gender" value="Male"/>

Female<form:radiobutton path="gender" value="Female"/><br><br>

Courses : SpringBoot <form:checkbox path="courses" value="SpringBoot" />
Docker <form:checkbox path="courses" value="Docker" />
MicroServices <form:checkbox path="courses" value="MicroServices" />
<br><br>



From : <form:select path="cityFrom">
<form:option value="NewJersey" label="NewJersey"></form:option>
<form:option value="NewJersey" label="NewJersey"></form:option>
<form:option value="NewJersey" label="NewJersey"></form:option>

</form:select>

<br>

To: 
 <form:select path="cityTo">
<form:option value="Colorado" label="Colorado"></form:option>
<form:option value="Florida" label="Florida"></form:option>
<form:option value="NewMexico" label="NewMexico"></form:option>
<br><br>


</form:select>
<input type="submit" value="ClickMe">

</form:form>

</body>
</html>