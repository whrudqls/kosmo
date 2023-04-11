package kr.co.kosmo.mvc.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.kosmo.mvc.vo.BoardVO;
@Controller
public class BoardController {

	//ViewName - String ��ȯ
	//View���� ���� ���� : mav.addObject("list", list); ��� Model�� ������ �޾Ƽ� ó��
	//board/boardList.jsp���� jstl�� EL�� list�� ��� 
	@RequestMapping(value="/boardlist")
	public String boardList(Model model) {
		//Dao�� ����
		List<BoardVO> list = new ArrayList<BoardVO>();
		// �ӽ� ������ �����
		for(int i=0; i<10;i++) {
			BoardVO vo = new BoardVO();
			vo.setNum(i+1);
			vo.setTitle("������ ���� ����������"+i);
			vo.setWriter("��浿");
			vo.setBdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
			list.add(vo);
		}
		model.addAttribute("list", list);
		return "board/boardList";
	}
	@RequestMapping(value="/boardForm")
	public ModelAndView bordForm() {
		ModelAndView mav = new ModelAndView("board/boardForm");
		return mav;
	}
	@RequestMapping(value="/boardIn", method = RequestMethod.POST)
	public ModelAndView boardInsert(BoardVO vo) {
		ModelAndView mav = new ModelAndView("redirect:boardlist");
		System.out.println("reip :"+vo.getReip());
		System.out.println("title : "+vo.getTitle());
		System.out.println("content : "+vo.getContent());
		return mav;
	}
	//<a href="boardDetail?num=1">
	@RequestMapping(value="/boardDetail",method = RequestMethod.GET)
	public String boardDetail(Model model, HttpServletRequest req) {
		int num = Integer.parseInt(req.getParameter("num"));
		// DB���� �󼼺��� ������ ���� 
		BoardVO vo = new BoardVO();
		vo.setNum(num);
		vo.setTitle("������ ���� ����������"+num);
		vo.setWriter("��浿");
		vo.setReip("192.168.0.11");
		vo.setContent("���� ȣȣ��");
		vo.setBdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		model.addAttribute("vo", vo);
		return "board/boardDetail";
	}
	
	
	
	
	
	
}
