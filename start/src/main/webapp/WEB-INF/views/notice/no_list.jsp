<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>★Mojuk★</title>
</head>
<body>

<jsp:include page="/WEB-INF/views/include/home.jsp" flush="true" />
<jsp:include page="/WEB-INF/views/include/header.jsp" flush="true" />
	<h1>공지사항</h1>
	<table border=1>
		<tr>
			<td>제목</td>
			<td>작성자</td>
		</tr>
		<tr>
			<td>가나다라마바사아자차카타파하</td>
			<td>이지선</td>
		</tr>
	</table>
	<input type="button" name="btnWrite" value="글쓰기" onclick="notice_write();">
</body>
<script type="text/javascript">
	function notice_write() {
		location.href='no_write.do';
	}
</script>
</html>
