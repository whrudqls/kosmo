package kr.co.kosmo.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.kosmo.mvc.vo.MemberDTO;
//Dao�� @Repository ��� =>Dao�� ������ ��� ������
//�⺻ �̱���
//xml�� ��(doa) ���� �Ⱦ����� @Repository(��ĳ��) �ѹ濡 ���� ���� ��
@Repository

public class MemberDao implements MemberDaoInter {
	
	@Autowired
	private SqlSessionTemplate ss;//�ڽ��� ������ ������ bean byname �Ϸ��� 


	@Override
	public void addmeber(MemberDTO dto) {
		//���� sql���� ss = ���丮����.����.���� ����(Ʈ��) ���
		//���ִ� ������ <bean id="ss"�� ~>
		ss.insert("member.add",dto);
		
	}

	@Override
	public int idcheck(String id) {			
		return ss.selectOne("member.idchk",id);
	}

}
