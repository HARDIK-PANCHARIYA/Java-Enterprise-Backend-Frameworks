<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>

<form action="login" method="POST">
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
<td></td>
<td><input type="Submit"></td>
</tr>

<tr>
<td>Don't have account ? </td>
<td><a href="signup.jsp">Signup</a></td>
</tr>

</table>
</form>

</body>
</html>