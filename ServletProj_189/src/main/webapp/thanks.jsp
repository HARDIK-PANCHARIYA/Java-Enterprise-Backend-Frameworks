<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>thanks</title>
</head>
<body>

<%
String username = (String)request.getAttribute("u");
String pass = (String)request.getAttribute("p");
String email = (String)request.getAttribute("e");
%>

<p>User Name :- <%=username %></p>
<p>Password :- <%=pass %></p>
<p>Email :- <%=email %></p>

<h2 style="color:red">Thanks for Registration</h2>


</body>
</html>