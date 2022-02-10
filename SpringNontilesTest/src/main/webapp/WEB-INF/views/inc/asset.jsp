<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- asset.jsp -->

<%
	String root = request.getContextPath();
	System.out.println("root: "+root);
%>

<!-- 스프링 MVC 프로젝트에서 정적 자원(html, css, js, 이미지)은 resources 폴더 하위에서 관리하도록 권장한다. -->

<link rel="stylesheet" href="<%= root %>/views/inc/css/bootstrap.css">
<link rel="stylesheet" href="<%= root %>/views/inc/css/main.css">


<script src="<%= root %>/views/inc/js/jquery-1.12.4.js"></script>
<script src="<%= root %>/views/inc/js/bootstrap.js"></script>
<script src="<%= root %>/views/inc/js/cookie.js"></script>