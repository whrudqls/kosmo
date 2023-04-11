<%@page import="ex3_spring.Ex1_HelloBean"%>
<%@page
	import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex1_hello.jsp</title>
</head>
<body>
	<%
	//springcontainer 생성
	//GenericXmlApplicationContext : spring 3.0부터 지원 됨, 제네릭 기능 즉 자바 5.0부터 사용 가능
	//패키징 명과 xml 위치만 적어도 상대적으로 읽어 와서 반영됨
	ApplicationContext ctx = new GenericXmlApplicationContext("ex3_spring/ex3.xml");
	//불러내는 순간 객체 바로 생성한다
	//이미 컨테이너에 bean으로 등록 되는 순간 ApplicationContext는 해당 bean을 싱글톤으로 생성한다.
	//그 주소를 여기 지역 변수로  선언해서 참조해서 사용해보자!
	//Ex1_HelloBeean ref = new Ex1_HelloBeean();//직접 생성한 객체라 김길동 null이 뜬다
	//사용해야될 bean 아이디를 작성
	//Ex1_HelloBean ref =(Ex1_HelloBean) ctx.getBean("hello"); x //제네릭이 캐스팅을 알아서 해준다//캐스팅이 있으면 좋지만
	//많아지면 안좋다
	Ex1_HelloBean ref =ctx.getBean("hello",Ex1_HelloBean.class);
	String msg = ref.printMessage();
	%>
	<%--jsp 
	ApplicationContext ctx = new GenericXmlApplicationContext("ex3_spring/ex3.xml");
	Ex1_HelloBean ref =ctx.getBean("hello",Ex1_HelloBean.class);
	String msg = ref.printMessage();
	는 서비스 영역이기때문에  init 영역(한번만 초기화 시켜주는 곳)에 선언해줘야 한다.<%%> 자체가 서비스 영역 jsp=서블릿,
	서비스 영역이기에 계속 생성 된다( LocalTodayServlet 새로고침 눌렀을시 서비스만 무한 생성됨,init에 넣으면 1번만)
	mvc 설계 시 서블릿이 하나인 이유 : 모든 요청을 받아서 제어를 해야하기 때문
	 --%>
	
	<%=msg %>	
	<%--	
	//Ex2_Profile.java를 만들어서 본인의 이름과 나이를 입력 받는 <bean을 정의해서 
	//ex2_pforile.jsp에서 스프링 컨테이너로 똑같이 출력해봐		
	 --%>
	 
</body>
</html>