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
Integer n1 = (Integer) request.getAttribute("n1");
Integer n2 = (Integer) request.getAttribute("n2");
Integer r = (Integer) request.getAttribute("r");
String opr = (String) request.getAttribute("opr");
%>

<p> 

<%= n1 %> <%= opr %> <%= n2 %> = <h3 style="display:inline"><%= r %></h3>


</p>

<p> 
  <%= n1 %> <%= opr %> <%= n2 %> = <span style="font-weight: bold; font-size: larger;"><%= r %></span>
</p>


</body>
</html>