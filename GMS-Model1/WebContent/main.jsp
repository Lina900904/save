<%@page import="service.MemberServiceImpl"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%! String a=""; %>


<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>HELLO</title>

<link rel="stylesheet" href="css/style.css" />
</head>
<body>

<%
a = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());



%> 
 <%=a %>
<h3>현재 회원수:<%= MemberServiceImpl.getInstance().memberCount() %> </h3>	

	<h1>★우 주 미 녀 이 슬 화 이 팅★</h1>
	<table id="main-tab" class="width-full margin-outo height-100">
		<tr class="height-100">
			<th class="weight-full height-100" colspan="2"><img
				class="width-20 height-100  margin-outo"
				src="img/home/turtle.PNG"><h1>★☆★☆★☆Turtle King★☆★☆★☆</h1>
				<img  class="main-tab layout; flot:right" src="img/home/serch.PNG"></th>
	

		</tr>
		<tr class="height-500 width-60 ">

			<td id="main-tab layout" class=" height-350 width-60"><br /> 
			<img class="main-tab layout " src="img/home/Main.PNG">
			<td class="height-350 width-20 margin-outo">

				<ul>
					<li><a href="jsp/home/user_login_form.jsp">사용자 로그인</a></li>
					<li><a href="jsp/home/admin_login.jsp">관리자 로그인</a></li>
					<li><a href="jsp/join/joinForm.jsp">회원가입</a></li>
					<li><a href="jsp/update/updateForm.jsp">비밀번호변경</a></li>
					<li><a href="jsp/delete/deleteForm.jsp">회원탈퇴</a></li>
					<li><a href="jsp/mypage/memberList.jsp">회원목록</a></li>
					<li><a href="jsp/mypage/searchTeamForm.jsp">팀이름 검색</a></li>
					<li><a href="jsp/mypage/searchIdForm.jsp">아이디 검색</a></li>
					
				</ul> <a class="width-full width-full margin-outo"
				href="../../html/mypage/mypage.html"> </a>
				<img class="main-tab layout " src="img/home/menu.PNG">
			</td>
		</tr>

		<tr class="height-100 margin-outo">
			<td class="margin-outo" colspan="2"><img
				class="main-tab layout " src="img/home/under.PNG"></td>

		</tr>
	</table>



</body>
</html>