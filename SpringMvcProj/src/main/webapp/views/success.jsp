<%@page import="jakarta.security.auth.message.MessagePolicy.Target"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- <%
String uname = (String) request.getAttribute("u");
String pass = (String) request.getAttribute("p");
String email = (String) request.getAttribute("e");
%>

<h2 style="color:Green">Registration Successfully</h2>
<h1>User Name :- <%=uname %></h1>
<h1>Password :- <%=pass %></h1>
<h1>Email :- <%=email %></h1> --%>

<h2 style="color:Green">Registration Successfully</h2>
<h1>User name :- ${user.uname}</h1>
<h1>Password :- ${user.password}</h1>
<h1>Email :- ${user.email}</h1>

</body>
</html>