package kr.co.kosmo.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.kosmo.mvc.vo.BoardVO;
@Repository
public class MyBoardDao implements MyBoardDaoInter{

	@Autowired
	SqlSessionTemplate ss;
	
	@Override
	public void addBoard(BoardVO vo) {
		ss.insert("myboard.add", vo);
		//∏ ¿« namespace¿« myboard
		//∏ ¿« add πÆ
		
	}
	@Override
	public List<BoardVO> listBoard() {
		List<BoardVO> list = ss.selectList("myboard.list");
		return list;
		//∏ ¿« namespace¿« myboard
		//∏ ¿« list πÆ
	}

	@Override
	public BoardVO detailBoard(int num) {
	
		return ss.selectOne("myboard.detail",num);
		//∏ ¿« namespace¿« myboard
		//∏ ¿« detail πÆ
	}

	@Override
	public void delBoard(int num) {
		
		
	}

}
