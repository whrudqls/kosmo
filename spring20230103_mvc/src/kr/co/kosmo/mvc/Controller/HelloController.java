package kr.co.kosmo.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//생략하면 난리남
//HelloController는 예전에 모델에 해당됨
//DispatcherServlet이란 컨트롤 서블릿이 스프링 컨테이너에 의해 model을 주입 받아서 실행
//HandlerMpping이 요청 사항을 분석 해준다.
@Controller // 없으면 DispatcherServlet(스프링 컨테이너를 가지고 있는 컨트롤러)이 모델이라고 인식을 못함(패키지 안에 있는건 모두 빈으로
			// 등록 시켜버릴거다!!!!)
public class HelloController {
	// http://localhost/spring20230103_mvc/hello(request) :중복이 되면 안됨
	// ActionFactory -->Spring Container --> DispatcherServlet
	// --> HandlerMpping이 분석
	@RequestMapping(value = "/hello")
	public ModelAndView myHello() {// 모델이 액션 팩토리 역할까지 다해줌
		ModelAndView mav = new ModelAndView();

		// request.setAttribute("key",Val);
		mav.addObject("msg", "<h1>안녕하세요2. 나의 첫번째 spring MVC입니다.</h1>");

		// new ActionForard("hello.jsp",false);
		mav.setViewName("hello");

		return mav;
	}

}
