package kr.co.kosmo.mvc.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
	// 모든 예외
	@ExceptionHandler(Exception.class)
	//중간에서 가로채서 처리 해줌 =>Model m
	public String myHandlerException(Model m, Exception e) {
		e.printStackTrace();
		System.out.println("예외메시지 : " + e.getMessage());
		String viewName = "";
		// 파라미터가 없을 때 @RequestParam으로 체크돼서.
		// MissingServletRequestParameterException: Required String parameter 'id' is
		// not present
		if (e instanceof MissingServletRequestParameterException) {
			m.addAttribute("emsg", "파라미터 값을 올바르게 작성해라1");
			viewName = "error/paramException";
		} else if (e instanceof UnsatisfiedServletRequestParameterException) {
			m.addAttribute("emsg", "파라미터 값을 올바르게 작성해라2");
			viewName = "error/paramException";
		} else {//아이디가 중복을 가입할 시
			m.addAttribute("emsg", "예외가 발생 됨?");
			viewName = "error/paramException";
		}
		return viewName;
	}
}
