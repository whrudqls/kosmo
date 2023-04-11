<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>
<c:if test="${today != null }">오늘 날짜  :${today}  you의 아이피는  : ${reip }  </c:if> 
</h1>
<h3>${work }</h3>
</body>
</html>