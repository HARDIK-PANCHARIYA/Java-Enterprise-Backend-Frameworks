<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String msg = (String) request.getAttribute("msg");
%>

<h3 style="text-align:center;color:red"> <%=msg %> </h3>



<form action="login" method="post">
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
<td>Email :- </td>
<td><input type="email" name="email"></td>
</tr>

<tr>
<td></td>
<td><input type="Submit"></td>
</tr>

</table>
</form>

</body>
</html>