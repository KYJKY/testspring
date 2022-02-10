<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- asset.jsp -->

<%
	String root = request.getContextPath();
	System.out.println("root: "+root);
%>

<!-- 스프링 MVC 프로젝트에서 정적 자원(html, css, js, 이미지)은 resources 폴더 하위에서 관리하도록 권장한다. -->

<link rel="stylesheet" href="<%= root %>/css/bootstrap.css">

<script src="<%= root %>/js/jquery-1.12.4.js"></script>
<script src="<%= root %>/js/bootstrap.js"></script>
<script src="<%= root %>/js/cookie.js"></script>