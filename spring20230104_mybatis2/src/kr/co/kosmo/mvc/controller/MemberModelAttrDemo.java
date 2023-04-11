package kr.co.kosmo.mvc.controller;

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

	//form�� ���� ���� �޼��带 ���� -forward
	//@RequestMapping(value="/memberForm",method = RequestMethod.GET)
	//only Get��ĸ� ���� spring4.X ����
	@GetMapping(value="/memberForm")
	public ModelAndView memberform() {
		ModelAndView mav = new ModelAndView("member/memberForm");
		return mav;
	}
	// memberIn ó���ϴ� �޼���� �ڵ鷯 ������ �����Ѵ�.
	// �Ķ���� ó�� : HttpServletRequest request WAS -> DispatcherServlet
	// -> SpringCotainer�� ���ؼ� ���� �޴´�.
	//@PostMapping(value="/memberIn")
	public ModelAndView addTest(HttpServletRequest request) {
		
		System.out.println("ID =>"+request.getParameter("id"));
		System.out.println("PWD =>"+request.getParameter("pwd"));
		System.out.println("NAME =>"+request.getParameter("uname"));
		
		ModelAndView mav = new ModelAndView("member/success");
		return mav;
	}
	// request.getParameter() �˾Ƽ� �Ķ���� ó�� ����
	//@PostMapping(value="/memberIn")
	public ModelAndView addTest(String id, String pwd, String uname) {
		
		System.out.println("ID2 =>"+id);
		System.out.println("PWD2 =>"+pwd);
		System.out.println("NAME2 =>"+uname);
		
		ModelAndView mav = new ModelAndView("member/success");
		return mav;
	}
	//VO�� �Ķ���͸� �˾Ƽ� ���ε� �ؼ� ������!
	//@PostMapping(value="/memberIn")
	public ModelAndView addTest(MemberDemoVO vo) {
		
		System.out.println("ID3 =>"+vo.getId());
		System.out.println("PWD3 =>"+vo.getPwd());
		System.out.println("NAME3 =>"+vo.getUname());
		
		ModelAndView mav = new ModelAndView("member/success");
		mav.addObject("vo", vo);
		return mav;
	}
	@PostMapping(value="/memberIn")
	public String addTest(Model model,@ModelAttribute(value = "vo") MemberDemoVO vo) {
		
		System.out.println("@ID3 =>"+vo.getId());
		System.out.println("@PWD3 =>"+vo.getPwd());
		System.out.println("NAME3 =>"+vo.getUname());
		vo.setRdate("2023-01-03"); // @ModelAttribute ����ϸ� ���� ���� �� ���� �����ϴ� �Ͱ� ����.
		//model.addAttribute("vo", vo);
		//ModelAndView mav = new ModelAndView("member/success");
		//mav.addObject("vo", vo);
		return "member/success";
	}
	
	
	
	
	
	
}
