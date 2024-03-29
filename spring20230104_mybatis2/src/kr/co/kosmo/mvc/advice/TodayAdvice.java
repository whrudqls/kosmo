package kr.co.kosmo.mvc.advice;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.condition.RequestConditionHolder;
/*
 * 일반적인 bean으로 스캔 당해서 등록됨 = @Component 
 * 컨트롤러는 모델에서만
 */
@Component
@Aspect // 원래 빈으로 등록했으나 자동등록()이므로 패스
public class TodayAdvice {

	// 공통 관심 사항이 무엇인가? => 날짜
	// target ? =>
	@Before("execution(* kr.co.kosmo.mvc.controller.TodayMy*.today*(..))")
	public void todayAdvicemethod() {
		String todate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		System.out.println("== Todate ==");
		System.out.println(todate);
	}
	@AfterReturning(pointcut = "execution(* kr.co.kosmo.mvc.controller.Today*.today*(..))", returning = "mav")
	public ModelAndView afterToday(JoinPoint jp, ModelAndView mav) {
		//RequestContextHolder 사용해서 HttpServletRequest 받아서 사용자의 아이피를 받아서 로깅 해보기 
		 ServletRequestAttributes ra =  
				 (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
		 HttpServletRequest request = ra.getRequest();
		mav.addObject("reip", request.getRemoteAddr());
		System.out.println("reip =>"+request.getRemoteAddr());
		mav.addObject("today", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		
		return mav;
	}
}





