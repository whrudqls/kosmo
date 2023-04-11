package kr.co.kosmo.mvc.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
	//��� ���� 
	@ExceptionHandler(Exception.class)
	public String myHandlerException(Model m, Exception e) {
		e.printStackTrace();
		System.out.println("���� �޼��� :"+e.getMessage());
		String viewName="";
		// �Ķ���Ͱ� ���� �� @RequestParam üũ�Ǿ ..
		//MissingServletRequestParameterException: Required String parameter 'id' is not present
		if(e instanceof MissingServletRequestParameterException) {
			m.addAttribute("emsg","�Ķ���Ͱ��� �ùٸ��� �ۼ� �Ͻÿ�");
			viewName ="error/paramException";
		}else if(e instanceof UnsatisfiedServletRequestParameterException) {
			m.addAttribute("emsg","�Ķ���Ͱ��� �ùٸ��� �ۼ� �Ͻÿ�2");
			viewName ="error/paramException";
		}else {
			m.addAttribute("emsg","���ܰ� �߻� �ǳ���?");
			viewName ="error/paramException";
		}
		return viewName;
	}
}
