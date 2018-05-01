<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="testPojo" method="post">
		username: <input type="text" name="username">
		<br/>
		password: <input type="password" name="password">
		<br/>
		email: <input type="text" name="email">
		<br/>
		age: <input type="text" name="age">
		<br/>
		city <input type="text" name="address.city">
		<br/>
		province <input type="text" name="address.province">
		<br/>
		<input type="submit" value="submit">
		
	</form>
	<br/>
	
	<a href="pathVariable/1">pathVariable</a>
	<br/>
	
	<a href="helloworld">helloworld</a>
</body>
</html>