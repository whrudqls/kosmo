package kr.co.kosmo.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodayDefaultController {
	//AOp가 적용돼서 /msin/index.jsp에서 ${today} 사용 가능
	
	@RequestMapping(value = {"/","/main"})
	public ModelAndView todayView(Model model) {// 모델이 액션 팩토리 역할까지 다해줌
		//return "main/index";
		ModelAndView mav = new ModelAndView("main/index");		
		
		return mav;
	}
	

}

