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
	<h1>프로젝트 작성</h1>
	<table>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea></textarea></td>
		</tr>
		<tr>
			<td>첨부파일</td>
			<td>
				<input type="text" name="file">
				<input type="button" name="file_submit" value="첨부">
			</td>
		</tr>
	</table>
	<input type="button" name="btnCancel" value="취소" onclick="Cancel();">
	<input type="button" name="btnSave" value="저장" onclick="Save();">
</body>
<script type="text/javascript">
	function Cancel() {
		location.href='pro_list.do';
	}
	
	function Save() {
		location.href='pro_list.do';
	}
</script>
</html>
