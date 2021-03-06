<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!-- tagdir 위치 안에 있는 tag들은 my란 prefix를 붙여 사용 가능함 -->
<%@ taglib prefix="my" tagdir="/WEB-INF/tags/CH16/lecture" %>


<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>

<%@ include file = "/WEB-INF/subModules/bootstrapHeader.jsp" %>

<title>Insert title here</title>
</head>
<body>

	<!-- navbar 커스텀 태그를 사용한 예 -->
	<my:navbar />

<div class="container">
	<!-- tag1 커스텀 태그를 사용한 예 -->
	<my:tag1 />
	<hr>
	<my:tag1 />
	
	<!-- 특징 -->
	<!-- #1. custom tag는 /WEB-INF/tags 폴더 또는 하위 폴더에 존재 -->
	<!-- #2. tag는 한 번 만들어두면 언제든 재사용이 가능함 -->
	<!-- #3. 쉽고 단순한 코드 작성을 도와주고, 가독성을 향상시킴 -->
</div>
</body>
</html>