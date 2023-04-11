package kr.co.kosmo.mvc.Controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.kosmo.mvc.dao.MemberDaoInter;
import kr.co.kosmo.mvc.vo.MemberDTO;

@Controller
@RequestMapping("/member")
public class MymemberController {
	// http://localhost/spring0706_mybatis/member/memberForm   => /WEB-INF/views/mymember/memberForm.jsp

	@Autowired
	private MemberDaoInter memberDaoInter;

	@GetMapping(value="/memberForm")
	public ModelAndView memberForm() {
		ModelAndView mav = new ModelAndView("mymember/memberForm");
		return mav;
	}
	// String�� ��쿡�� viewName ���� , Model���ڷ� ���� �� �ִ�.
	@PostMapping(value="/memberIn")
	public String memberIn(MemberDTO dto) {
		System.out.println("ID : "+dto.getId());
		// �������̽��� ����� �Է¸޼��� ȣ��!
		memberDaoInter.addmeber(dto);;
		//ȸ�� ������ ������ ���� �̵��� ������ ���� - redirect 
		return "redirect:/main";
	}

	// �ݵ�� id�� �Ķ���Ͱ� �־�� �Ѵ�.(üũ ���) 
	@GetMapping(value="/idcheck")
	public String idCheck(Model m,@RequestParam String id) {
		System.out.println("idAjax:"+id);
		int cnt = memberDaoInter.idcheck(id);
		m.addAttribute("msg", cnt);
		return "mymember/idchk";
	}
}
