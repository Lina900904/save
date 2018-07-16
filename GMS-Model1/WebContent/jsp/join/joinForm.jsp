<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- String memName, 생년월일 800101-1,  password, teamId ; -->

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>JOIN</title>
	<link rel="stylesheet" href="../../css/style.css" />
</head>
<body>
<div id = "join-Layout">
<h1> 회원가입</h1>
<form id = "join-Form" action="joinResult.jsp">
ID <input type="text" name = "userid"/><br />
NAME <input type="text" name = "name" /><br />
PASSWORD <input type="text" name = "password" /><br />
주민등록번호 <input type="text" name = "ssn" /><br />
<br />
<input type="submit" value = "확인"/>
<input type="submit" value = "취소" />
</form>
</div>

</body>
</html>