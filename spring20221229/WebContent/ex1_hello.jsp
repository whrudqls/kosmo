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
	//springcontainer ����
	//GenericXmlApplicationContext : spring 3.0���� ���� ��, ���׸� ��� �� �ڹ� 5.0���� ��� ����
	//��Ű¡ ��� xml ��ġ�� ��� ��������� �о� �ͼ� �ݿ���
	ApplicationContext ctx = new GenericXmlApplicationContext("ex3_spring/ex3.xml");
	//�ҷ����� ���� ��ü �ٷ� �����Ѵ�
	//�̹� �����̳ʿ� bean���� ��� �Ǵ� ���� ApplicationContext�� �ش� bean�� �̱������� �����Ѵ�.
	//�� �ּҸ� ���� ���� ������  �����ؼ� �����ؼ� ����غ���!
	//Ex1_HelloBeean ref = new Ex1_HelloBeean();//���� ������ ��ü�� ��浿 null�� ���
	//����ؾߵ� bean ���̵� �ۼ�
	//Ex1_HelloBean ref =(Ex1_HelloBean) ctx.getBean("hello"); x //���׸��� ĳ������ �˾Ƽ� ���ش�//ĳ������ ������ ������
	//�������� ������
	Ex1_HelloBean ref =ctx.getBean("hello",Ex1_HelloBean.class);
	String msg = ref.printMessage();
	%>
	<%--jsp 
	ApplicationContext ctx = new GenericXmlApplicationContext("ex3_spring/ex3.xml");
	Ex1_HelloBean ref =ctx.getBean("hello",Ex1_HelloBean.class);
	String msg = ref.printMessage();
	�� ���� �����̱⶧����  init ����(�ѹ��� �ʱ�ȭ �����ִ� ��)�� ��������� �Ѵ�.<%%> ��ü�� ���� ���� jsp=����,
	���� �����̱⿡ ��� ���� �ȴ�( LocalTodayServlet ���ΰ�ħ �������� ���񽺸� ���� ������,init�� ������ 1����)
	mvc ���� �� ������ �ϳ��� ���� : ��� ��û�� �޾Ƽ� ��� �ؾ��ϱ� ����
	 --%>
	
	<%=msg %>	
	<%--	
	//Ex2_Profile.java�� ���� ������ �̸��� ���̸� �Է� �޴� <bean�� �����ؼ� 
	//ex2_pforile.jsp���� ������ �����̳ʷ� �Ȱ��� ����غ�		
	 --%>
	 
</body>
</html>