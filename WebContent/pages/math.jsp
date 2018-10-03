<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>a=<%= request.getAttribute("a") %>, b=<%= request.getAttribute("b") %></p>
<p>a+b=<%= request.getAttribute("sum") %></p>
<p>a*b=<%= request.getAttribute("mul") %></p>
</body>
</html>