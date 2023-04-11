<%@page import="exam.Ex2_Profile"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
ApplicationContext ctx = new GenericXmlApplicationContext("ex3_spring/ex4.xml");
Ex2_Profile ref= ctx.getBean("profile",Ex2_Profile.class);
System.out.println(ref.printProfile());

%>


</body>
</html>