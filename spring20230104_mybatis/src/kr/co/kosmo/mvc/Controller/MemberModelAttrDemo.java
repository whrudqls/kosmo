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
//fomr�� ���� ���� �޼��带 ���� - formwark
	
	//@RequestMapping(value = "/memberForm", method = RequestMethod.GET)
	//������ get��ĸ� ����spring4.x(����) ����
	@GetMapping(value = "/memberForm")
	public ModelAndView memberform() {

		ModelAndView mav = new ModelAndView("member/memberForm");
		return mav;

	}
	//memberIN ó���ϴ� �޼���� �ڵ鷯 ������ �����Ѵ�.
	//�Ķ���� ó�� : HttpServletRequest => Was����  DispatcherServlet -> springc ontainer�����ؼ� ���� �޴´�.
	//@PostMapping(value = "/memberIn")
	public ModelAndView addTest(HttpServletRequest request) {//DispatcherServlet�� �ִ� ������Ʈ�� �޾ƾ��Ѵ� �츮�� ���� �ȸ���� ����
		System.out.println("ID : "+request.getParameter("id"));
		System.out.println("PWD : "+request.getParameter("pwd"));
		System.out.println("NAME : "+request.getParameter("uname"));
		
		ModelAndView mav = new ModelAndView("member/success");
		return mav;
	}
	//request.getParameter �˾Ƽ� �Ķ���� ó�� ����
	//@PostMapping(value = "/memberIn")
	//DispatcherServlet�� �ִ� ������Ʈ�� �޾ƾ��Ѵ� �츮�� ���� �ȸ���� ����
	public ModelAndView addTest(String id, String pwd,String uname) {
		System.out.println("ID2 : "+id);
		System.out.println("PWD2 : "+pwd);
		System.out.println("NAME2 : "+uname);
		
		ModelAndView mav = new ModelAndView("member/success");
		return mav;
	}
	//VO�� �Ķ���͸� �˾Ƽ� ���ε��ؼ� ������
	//�÷���,dto,
	//@PostMapping(value = "/memberIn")
	
	public ModelAndView addTest(MemberDemoVO vo) {//DispatcherServlet�� �ִ� ������Ʈ�� �޾ƾ��Ѵ� �츮�� ���� �ȸ���� ����
		System.out.println("ID3 : "+vo.getId());
		System.out.println("PWD3: "+vo.getPwd());
		System.out.println("NAME3 : "+vo.getUname());
		
		
		ModelAndView mav = new ModelAndView("member/success");
		mav.addObject("vo",vo);//vo�� success �� ���� �ְ� ��� => ��� ��Ʈ�ѷ��� ���鼭 �¾�Ʈ����Ʈ �̿��ϱ�
		return mav;
	}	

	
	@PostMapping(value = "/memberIn")
	public String addTest(Model model,@ModelAttribute(value = "vo") MemberDemoVO vo) {//DispatcherServlet�� �ִ� ������Ʈ�� �޾ƾ��Ѵ� �츮�� ���� �ȸ���� ����
		System.out.println("ID3 : "+vo.getId());
		System.out.println("PWD3: "+vo.getPwd());
		System.out.println("NAME3 : "+vo.getUname());
		vo.setRdate("2023-01-03");//@ModelAttribute�� ����ϸ� ���� ���� �� ���� �����ϴ� �Ͱ� ����.
		
		//model.addAttribute("vo",vo);		
		
		return "member/success";
	}

	
	

}
