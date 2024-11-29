<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>signup</title>
</head>
<body>

<form action="signup" method="POST">
<table align="center" cellpadding=4 width="300px">
<tr>
<td>User Name :- </td>
<td><input type="text" name="uname"></td>
</tr>

<tr>
<td>Password :- </td>
<td><input type="text" name="password"></td>
</tr>

<tr>
<td>email :- </td>
<td><input type="text" name="email"></td>
</tr>

<tr>
<td></td>
<td><input type="Submit"></td>
</tr>

<tr>
<td>Already have account ? </td>
<td><a href="login.jsp">login</a></td>
</tr>

</body>
</html>