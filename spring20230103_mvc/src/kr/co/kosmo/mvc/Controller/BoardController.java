package kr.co.kosmo.mvc.Controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.kosmo.mvc.vo.BoardVO;

@Controller
public class BoardController {
	// 1.boardForm
	@RequestMapping(value = "/boardForm")
	public ModelAndView boardForm() {
		ModelAndView mav = new ModelAndView("board/boardForm");
		return mav;
	}

	// 2.boardIn
	/*
	 * sysout("reip : )"+vo.getReip()); sysout("title : )"+vo.getTitle());
	 * sysout("content : )"+vo.getContent());
	 */
	@RequestMapping(value = "/boardIn")
	public ModelAndView boardIn(BoardVO vo) {
		System.out.println("title : " + vo.getTitle());
		System.out.println("content : " + vo.getContent());
		System.out.println("writer : " + vo.getWriter());
		ModelAndView mav = new ModelAndView("redirect:boardList");
		return mav;
	}

	// 3. boardList
	/*
	 * List<BoardVO> list = new ArrayList<BoardVO> 임시데이터 만들기
	 */
	@RequestMapping(value = "/boardList")
	public ModelAndView boardList() {
		ModelAndView mav = new ModelAndView("board/boardList");
		List<BoardVO> list = new ArrayList<BoardVO>();
		// 임시데이터
		for (int i = 0; i < 10; i++) {
			BoardVO vo = new BoardVO();
			vo.setNum(i);
			vo.setTitle("title : " + i);
			vo.setWriter("writer : " + i);
			vo.setContent("content : " + i);
			vo.setBdate("bdate : " + i);
			vo.setReip("reip : " + i);
			list.add(vo);
		}
		mav.addObject("list", list);
		return mav;
	}
	
	

}
