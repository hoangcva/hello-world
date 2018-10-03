<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/math" method="post">
		first number: <input type="text" name = "firstnumber">
		<br>
		second number: <input type="text" name = "secondnumber">
		<br>
		<input type="submit" value="submit">
	</form>
</body>
</html>