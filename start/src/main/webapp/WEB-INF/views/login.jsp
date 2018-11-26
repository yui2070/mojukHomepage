<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>★Mojuk★</title>
	<style>
		.wrapper {
			background-image: url('../resources/images/bamboo.jpg');
			background-size: 100%;
		}
		
		#login {
			border: 1px solid black;
			background-color: white;
			width: 500px;
			height: 300px;
			position: relative;
			top: 225px;
			left: 900px;
		}
		
		#login_form {
			text-align: center;
			position: relative;
			top: 50px;
			left: 100px;
		}
	</style>
<link rel="stylesheet" type="text/css" href="../resources/css/images.css"/>
</head>
<script type="css"></script>
<body class="wrapper">
<div id="login">
	<table id="login_form">
		<tr>
			<th colspan="3"><font size="8">로그인</font></th>
		</tr>
		<tr>
			<td><font size="6">ID</font></td>
			<td><input type="text" name="id"></td>
			<td lowspan="2"><input type="button" id="btnlogin" value="로그인" onclick="login();"></td>
		</tr>
		<tr>
			<td><font size="6">PW</font></td>
			<td><input type="text" name="pw"></td>
		</tr>
	</table>
</div>
<img alt="mojuk_logo" src="../resources/images/mojuk_logo.png" id="f_logo">
</body>
<script type="text/javascript">
	function login() {
		location.href='/mainpage.do';
	}
</script>
</html>
