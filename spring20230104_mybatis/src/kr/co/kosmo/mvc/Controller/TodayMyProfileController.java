package kr.co.kosmo.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodayMyProfileController {
	//비포 수행 시점
	@RequestMapping(value = "/myprofile",method = RequestMethod.GET)
	public ModelAndView todayProfile() {// 모델이 액션 팩토리 역할까지 다해줌
		ModelAndView mav = new ModelAndView();		
		mav.addObject("profile", "<h1>나는 스프링의 길동이다</h1>");	
		mav.setViewName("today/todayProfile");
		return mav;
	}
	
	//비포 수행 시점	
	@RequestMapping(value = "/todaywk",method = RequestMethod.GET)
	public ModelAndView todayWork() {// 모델이 액션 팩토리 역할까지 다해줌
		ModelAndView mav = new ModelAndView();		
		mav.addObject("work", "<h1>쉬운작업입니다</h1>");	
		mav.setViewName("today/todayWork");
		return mav;
	}
	

}

