package kr.co.kosmo.mvc.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.kosmo.mvc.vo.MemberDemoVO;

@Controller
public class MemberModelAttrDemo {
//fomr을 띄우기 위한 메서드를 정의 - formwark
	
	//@RequestMapping(value = "/memberForm", method = RequestMethod.GET)
	//오로지 get방식만 지정spring4.x(버전) 지원
	@GetMapping(value = "/memberForm")
	public ModelAndView memberform() {

		ModelAndView mav = new ModelAndView("member/memberForm");
		return mav;

	}
	//memberIN 처리하는 메서드와 핸들러 매핑을 정의한다.
	//파라미터 처리 : HttpServletRequest => Was에서  DispatcherServlet -> springc ontainer에의해서 주입 받는다.
	//@PostMapping(value = "/memberIn")
	public ModelAndView addTest(HttpServletRequest request) {//DispatcherServlet이 주는 리퀘스트를 받아야한다 우리가 모델을 안만들기 때문
		System.out.println("ID : "+request.getParameter("id"));
		System.out.println("PWD : "+request.getParameter("pwd"));
		System.out.println("NAME : "+request.getParameter("uname"));
		
		ModelAndView mav = new ModelAndView("member/success");
		return mav;
	}
	//request.getParameter 알아서 파라미터 처리 해줌
	//@PostMapping(value = "/memberIn")
	//DispatcherServlet이 주는 리퀘스트를 받아야한다 우리가 모델을 안만들기 때문
	public ModelAndView addTest(String id, String pwd,String uname) {
		System.out.println("ID2 : "+id);
		System.out.println("PWD2 : "+pwd);
		System.out.println("NAME2 : "+uname);
		
		ModelAndView mav = new ModelAndView("member/success");
		return mav;
	}
	//VO에 파라미터를 알아서 바인딩해서 저장함
	//컬럼명,dto,
	//@PostMapping(value = "/memberIn")
	
	public ModelAndView addTest(MemberDemoVO vo) {//DispatcherServlet이 주는 리퀘스트를 받아야한다 우리가 모델을 안만들기 때문
		System.out.println("ID3 : "+vo.getId());
		System.out.println("PWD3: "+vo.getPwd());
		System.out.println("NAME3 : "+vo.getUname());
		
		
		ModelAndView mav = new ModelAndView("member/success");
		mav.addObject("vo",vo);//vo에 success 를 집어 넣고 출력 => 헬로 컨트롤러와 보면서 셋어트리뷰트 이용하기
		return mav;
	}	

	
	@PostMapping(value = "/memberIn")
	public String addTest(Model model,@ModelAttribute(value = "vo") MemberDemoVO vo) {//DispatcherServlet이 주는 리퀘스트를 받아야한다 우리가 모델을 안만들기 때문
		System.out.println("ID3 : "+vo.getId());
		System.out.println("PWD3: "+vo.getPwd());
		System.out.println("NAME3 : "+vo.getUname());
		vo.setRdate("2023-01-03");//@ModelAttribute를 사용하면 모델이 수행 수 값을 전송하는 것과 같다.
		
		//model.addAttribute("vo",vo);		
		
		return "member/success";
	}

	
	

}
