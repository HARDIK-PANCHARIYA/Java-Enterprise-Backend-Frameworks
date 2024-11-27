<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>calculator</title>
</head>
<body>

<form action="OperationServlet" method="POST">
<table align="center" cellpadding=4 width="300px">
<tr>
<td>Enter First Number :- </td>
<td><input type="text" name="n1"></td>
</tr>

<tr>
<td>Enter Second Number :- </td>
<td><input type="text" name="n2"></td>
</tr>

<tr>
<td>Select Operation</td>
<td>
<select name="opr">
<option value="+">+</option>
<option value="-">-</option>
<option value="*">*</option>
<option value="/">/</option>
</select>
</td>
</tr>

<tr>
<td></td>
<td><input type="Submit" value="Calculate"></td>
</tr>
</table>
</form>

</body>
</html>