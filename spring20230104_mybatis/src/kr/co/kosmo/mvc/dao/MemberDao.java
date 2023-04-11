package kr.co.kosmo.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.kosmo.mvc.vo.MemberDTO;
//Dao단 @Repository 사용 =>Dao를 빈으로 등록 시켜줌
//기본 싱글톤
//xml에 빈(doa) 많이 안쓰려고 @Repository(스캐닝) 한방에 묶어 쓰는 것
@Repository

public class MemberDao implements MemberDaoInter {
	
	@Autowired
	private SqlSessionTemplate ss;//코스모 웹에서 정의한 bean byname 하려고 


	@Override
	public void addmeber(MemberDTO dto) {
		//원래 sql세션 ss = 팩토리서비스.겟팩.오픈 세션(트루) 대신
		//해주는 설정이 <bean id="ss"다 ~>
		ss.insert("member.add",dto);
		
	}

	@Override
	public int idcheck(String id) {			
		return ss.selectOne("member.idchk",id);
	}

}
