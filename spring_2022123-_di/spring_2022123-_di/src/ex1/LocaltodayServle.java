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
	 * ���� ������ ����Ŭ ����
	 * ��û�� ���� �� ������ ȣ�� --> initȣ��(�� �� �� ����) --> service ��� --> doGet/doPost
	 * 
	 */
	
    public LocaltodayServle() {
    	 System.out.println("���� ������ ȣ��!");
    }


    //�� �� �����Ǳ�� ������, web.xml�� �ִ� context.xml�� ���� �� ���
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init ȣ��!");
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
		System.out.println("service ȣ��");
		//������ bean �ּҸ� �޾ƿ´�.
		//1. �̱��� ����: scope="prototype"���� �ָ� getBean() ȣ������ �� ��ü�� �����ϴ� ����
		//lazy������ ����. ������ �� �ּҴ� ���� �����Ǳ⿡ �ּҰ��� �ٸ���. �� �̱����� �ƴ϶�� ���̴�.
		LocalToday today = ctx.getBean("today",LocalToday.class);
		LocalToday today2 = ctx.getBean("today",LocalToday.class);
		System.out.println("�̱��� ��1: " + (today==today2));
		
		//2.lazy-init �Ӽ�
		//beanFactory�� ���� getBea() ȣ���ϴ� ����
		//lazy-init="true" getBean()���� ȣ���ϴ� �������� �����ص� �ּҴ� ����. �� �⺻���� �̱����̶�� ��.
		LazyBean ref = ctx.getBean("lazy",LazyBean.class);
		LazyBean ref1 = ctx.getBean("lazy",LazyBean.class);
		System.out.println("�̱��� ��2: " + (ref==ref1)); //�̱����̱� ������ �ּҴ� ����. 
		String res = today.printLocaltoday();
		//forward�� ����
		request.setAttribute("today", res);
		RequestDispatcher rd = request.getRequestDispatcher("today.jsp");
		rd.forward(request, response);

	}

}
