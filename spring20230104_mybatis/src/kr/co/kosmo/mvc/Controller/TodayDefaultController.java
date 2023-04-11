package kr.co.kosmo.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodayDefaultController {
	//AOp�� ����ż� /msin/index.jsp���� ${today} ��� ����
	
	@RequestMapping(value = {"/","/main"})
	public ModelAndView todayView(Model model) {// ���� �׼� ���丮 ���ұ��� ������
		//return "main/index";
		ModelAndView mav = new ModelAndView("main/index");		
		
		return mav;
	}
	

}

