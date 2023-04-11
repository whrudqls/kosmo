package kr.co.kosmo.mvc.dao;

import kr.co.kosmo.mvc.vo.MemberDTO;

public interface MemberDaoInter {
	
	public void addmeber(MemberDTO dto);
	public int idcheck(String id);
	
	
}
