<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<p>���̵� : ${dto.id}

<p>�̸� :${dto.name}
</p>
<p>���� :${dto.gender}
</p>
<p>���� :${dto.age}
</p>
<p><input type="button" value="Home" onclick="location='main.kosmo?cmd=index'">
</p>
</body>
</html>