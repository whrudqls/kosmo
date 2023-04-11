package kr.co.kosmo.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.kosmo.mvc.vo.MemerDTO;
//Dao���� @Repository ��� => Dao�� ������ ��� �����ش�.
//�̱����̴�. �⺻��
@Repository
public class MemberDao implements MemberDaoInter{
	// kosmo-web.xml���� ������ bean byName
	@Autowired
	private SqlSessionTemplate ss;
	@Override
	public void addMember(MemerDTO dto) {
		// SqlSession ss = FactoryService.getFactory().openSession(true); ��� 
		// ���ִ� ������ <bean id="ss" class="org.mybatis.spring.SqlSessionTemplate">
		ss.insert("member.add", dto);
	
	}
	@Override
	public int idcheck(String id) {
		return ss.selectOne("member.idchk", id);
	}

}
