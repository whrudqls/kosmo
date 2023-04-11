package ex2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@WebServlet("/Ex1_ResourceServlet")
public class Ex1_ResourceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationContext ctx;

	@Override
	public void init() throws ServletException {
		ctx = new GenericXmlApplicationContext("ex2/ex2_res.xml");

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		Ex1_Resource ref = ctx.getBean("ex2", Ex1_Resource.class);
		request.setAttribute("msg", ref.getRes().resource1());
		RequestDispatcher rd = request.getRequestDispatcher("ex.jsp");
		rd.forward(request, response);
	}

}
