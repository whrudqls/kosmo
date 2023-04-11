package ex2;

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

@WebServlet("/MyTestServlet")
public class MyTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationContext ctx;

	public void init(ServletConfig config) throws ServletException {
		ctx = new GenericXmlApplicationContext("ex2/ex2.xml");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		usespring(request, response);

	}

	protected void nonspring(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 외부 조립기에 해당되는 MyAssembler 객체 생성 + 스프링 사용하지 않음
		String res = new MyAssembler().getPrintv();
		request.setAttribute("today", res);
		RequestDispatcher rd = request.getRequestDispatcher("today.jsp");
		rd.forward(request, response);

	}

	protected void usespring(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// spring container에 의한 DI
		MyTestA ref = ctx.getBean("testA", MyTestA.class);
		String res = ref.printUseb();
		request.setAttribute("today", res);
		RequestDispatcher rd = request.getRequestDispatcher("today.jsp");
		rd.forward(request, response);

	}

}
