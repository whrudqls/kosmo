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
	//string일 경우에는 view의 이름을 전달, 값은 모델인자로 보낼 수 있다.
	@PostMapping(value = "/memberIn")
	public String memberIn(MemberDTO dto) {
		System.out.println("ID : "+dto.getId());
		System.out.println("gender : "+dto.getGender());
		System.out.println("age : "+dto.getAge());
		System.out.println("name : "+dto.getName());
		//인터페이스를 사용한 입력메서드 호출
		memberDaoInter.addmeber(dto);
		//회원 가입이 끝나고 나면 이동할 페이지 결정 -redirect
		return "redirect:/main";
		
	}
	//반드시 id란에 파라미터가 있어야 한다 (체크 대상)
	@GetMapping(value = "/idcheck")
	public String idCheck(Model m,@RequestParam("id") String id) {
		System.out.println("idAjax : "+id);
		int cnt = memberDaoInter.idcheck(id);
		m.addAttribute("msg",cnt);
		return "mymember/idchk";
	}
	
	
	
	

}
