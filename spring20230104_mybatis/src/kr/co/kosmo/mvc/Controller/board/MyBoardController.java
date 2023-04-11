package kr.co.kosmo.mvc.Controller.board;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.kosmo.mvc.dao.MyBoardDaoInter;
import kr.co.kosmo.mvc.vo.BoardVO;

@Controller
@RequestMapping(value = "/myboard")
public class MyBoardController {
	
	@Autowired
	private MyBoardDaoInter inter;	
	//������
	@RequestMapping(value = "/boardform")
	public String form() {
		System.out.println("�� ����");
		return "board/boardForm";
	}	
	//add	//��θ� �̵��Ұ��̶� string����  ����
	@PostMapping(value = "/boardIn")
	public String boardAdd(BoardVO vo) {
		inter.addBoard(vo);
		return "redirect:boardlist";
	}	
	//����Ʈ �̱�
	@RequestMapping(value = "/boardlist")
	public ModelAndView boardList() {
		List<BoardVO> list = inter.listBoard(); 
		ModelAndView mav = new ModelAndView("board/boardList");
		mav.addObject("list",list);
		return mav;
	}		
	//detail
	@GetMapping(value = "/boardDetail")
	public String boardDetail(Model m,int num) {
		BoardVO vo = inter.detailBoard(num);
		m.addAttribute("vo",vo);
		return "board/boardDetail";
	}
	
	//update
	
	

	
	
	//delete
	
	
	
	
	
	

}
