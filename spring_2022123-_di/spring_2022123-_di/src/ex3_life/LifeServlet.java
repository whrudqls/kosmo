package ex3_life;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@WebServlet("/LifeServlet")
public class LifeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationContext ctx;

	public void init(ServletConfig config) throws ServletException {
		/* <라이프 사이클의 핵심> 
		 * ***************************************************
		 * 1. 스프링컨테이너에 의해서 객체가 생성
		 * 1-1. 생성자로 injection을 사용했으면 이때 해당 빈은 초기화됨
		 * 2.setter 주입 ==> 1.1 + 2 = DI
		 * 3. init() 초기화*********
		 * ***************************************************
		 * 
		 * 4.getBean() 해당 객체의 주소값을 리턴
		 * 5.method1()호출할 때 호출
		 * 6. 스프링 컨테이너 종료: destroy() 호출!
		 */
	
		ctx = new GenericXmlApplicationContext("ex3_life/life.xml");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LifeInter inter = ctx.getBean("life",LifeInter.class);
		String name = inter.method1();
		request.setAttribute("today", name);
		RequestDispatcher rd = request.getRequestDispatcher("today.jsp");
		rd.forward(request, response);
	}

	/*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	*/

}
