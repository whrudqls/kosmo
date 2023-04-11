package kr.co.kosmo.mvc.Controller2;

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

//http://localhost/spring20230104_mybatis/member/memberForm => /WEB-INF/views/mymember/member
@Controller
@RequestMapping("/member")
public class MyMemeberController {
	 @Autowired
	  private MemberDaoInter memberDaoInter;

	@GetMapping(value = "/memberForm")
	public ModelAndView memberForm() {
		ModelAndView mav = new ModelAndView("mymember/memberForm");
		return mav;
	}
	//string�� ��쿡�� view�� �̸��� ����, ���� �����ڷ� ���� �� �ִ�.
	@PostMapping(value = "/memberIn")
	public String memberIn(MemberDTO dto) {
		System.out.println("ID : "+dto.getId());
		System.out.println("gender : "+dto.getGender());
		System.out.println("age : "+dto.getAge());
		System.out.println("name : "+dto.getName());
		//�������̽��� ����� �Է¸޼��� ȣ��
		memberDaoInter.addmeber(dto);
		//ȸ�� ������ ������ ���� �̵��� ������ ���� -redirect
		return "redirect:/main";
		
	}
	//�ݵ�� id���� �Ķ���Ͱ� �־�� �Ѵ� (üũ ���)
	@GetMapping(value = "/idcheck")
	public String idCheck(Model m,@RequestParam("id") String id) {
		System.out.println("idAjax : "+id);
		int cnt = memberDaoInter.idcheck(id);
		m.addAttribute("msg",cnt);
		return "mymember/idchk";
	}
	
	
	
	

}
