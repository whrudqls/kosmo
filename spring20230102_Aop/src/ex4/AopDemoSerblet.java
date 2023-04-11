package ex4;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@WebServlet("/AopDemoSerblet")
public class AopDemoSerblet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationContext ctx;

	public void init(ServletConfig config) throws ServletException {
		ctx = new GenericXmlApplicationContext("ex4/ex1_aop.xml");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {

		DaoInter dao = ctx.getBean("dao", DaoInter.class);
		dao.first();
		//dao.second();
		//dao.third();
		//dao.firstStatementTest(1);
		//dao.firstStatementTest(2);		
	}

}
