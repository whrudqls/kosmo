package ex1;

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


@WebServlet("/LocaltodayServle")
public class LocaltodayServle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationContext ctx;

	/*
	 * 서블릿 라이프 사이클 복습
	 * 요청이 왔을 때 생성자 호출 --> init호출(딱 한 번 생성) --> service 대기 --> doGet/doPost
	 * 
	 */
	
    public LocaltodayServle() {
    	 System.out.println("서블릿 생성자 호출!");
    }


    //한 번 생성되기는 하지만, web.xml에 있는 context.xml을 만들 때 사용
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 호출!");
		ctx = new GenericXmlApplicationContext("ex1/today.xml");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service 호출");
		//생성된 bean 주소를 받아온다.
		//1. 싱글톤 증명: scope="prototype"으로 주면 getBean() 호출했을 때 객체를 생성하는 것은
		//lazy설정과 같다. 하지만 두 주소는 각기 생성되기에 주소값은 다르다. 즉 싱글톤이 아니라는 것이다.
		LocalToday today = ctx.getBean("today",LocalToday.class);
		LocalToday today2 = ctx.getBean("today",LocalToday.class);
		System.out.println("싱글톤 비교1: " + (today==today2));
		
		//2.lazy-init 속성
		//beanFactory와 같이 getBea() 호출하는 시점
		//lazy-init="true" getBean()으로 호출하는 시점에서 생성해도 주소는 같음. 즉 기본값은 싱글톤이라는 것.
		LazyBean ref = ctx.getBean("lazy",LazyBean.class);
		LazyBean ref1 = ctx.getBean("lazy",LazyBean.class);
		System.out.println("싱글톤 비교2: " + (ref==ref1)); //싱글톤이기 때문에 주소는 같다. 
		String res = today.printLocaltoday();
		//forward로 전송
		request.setAttribute("today", res);
		RequestDispatcher rd = request.getRequestDispatcher("today.jsp");
		rd.forward(request, response);

	}

}
