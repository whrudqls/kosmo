package kr.co.kosmo.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//�����ϸ� ������
//HelloController�� ������ �𵨿� �ش��
//DispatcherServlet�̶� ��Ʈ�� ������ ������ �����̳ʿ� ���� model�� ���� �޾Ƽ� ����
//HandlerMpping�� ��û ������ �м� ���ش�.
@Controller // ������ DispatcherServlet(������ �����̳ʸ� ������ �ִ� ��Ʈ�ѷ�)�� ���̶�� �ν��� ����(��Ű�� �ȿ� �ִ°� ��� ������
			// ��� ���ѹ����Ŵ�!!!!)
public class HelloController {
	// http://localhost/spring20230103_mvc/hello(request) :�ߺ��� �Ǹ� �ȵ�
	// ActionFactory -->Spring Container --> DispatcherServlet
	// --> HandlerMpping�� �м�
	@RequestMapping(value = "/hello")
	public ModelAndView myHello() {// ���� �׼� ���丮 ���ұ��� ������
		ModelAndView mav = new ModelAndView();

		// request.setAttribute("key",Val);
		mav.addObject("msg", "<h1>�ȳ��ϼ���2. ���� ù��° spring MVC�Դϴ�.</h1>");

		// new ActionForard("hello.jsp",false);
		mav.setViewName("hello");

		return mav;
	}

}
