<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

String uname = (String)request.getAttribute("u");
List<String> elist = (List<String>) request.getAttribute("data");

%>

<h3 style="text-align:center;color:green">welcome, <%=uname %></h3>
<hr>

<%
for(String e : elist){
%>
<h3><%=e %></h3>
<%
}
%>
</body>
</html>