<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h3>
<form:form action="register" method="post" modelAttribute="userRecord">
Enter New User Id:<form:input  path="username"/>
<br/><br/>
Enter New Password:<form:input path="password"/>
<br/><br/>
Enter User's Type:<form:input  path="type"/>
<br/><br/>
<input type="submit" value="Submit"/>
</form:form>
</h3>
</div>
</body>
</html>