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
		/* <������ ����Ŭ�� �ٽ�> 
		 * ***************************************************
		 * 1. �����������̳ʿ� ���ؼ� ��ü�� ����
		 * 1-1. �����ڷ� injection�� ��������� �̶� �ش� ���� �ʱ�ȭ��
		 * 2.setter ���� ==> 1.1 + 2 = DI
		 * 3. init() �ʱ�ȭ*********
		 * ***************************************************
		 * 
		 * 4.getBean() �ش� ��ü�� �ּҰ��� ����
		 * 5.method1()ȣ���� �� ȣ��
		 * 6. ������ �����̳� ����: destroy() ȣ��!
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
