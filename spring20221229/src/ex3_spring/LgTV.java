package ex3_spring;

/*
 * ���յ�(coupling)�� ���� ���α׷�
 * ���յ��� �ϳ��� Ŭ������ �ٸ� Ŭ������ �󸶳� ���� ���� �Ǿ� �ִ�����
 * ��Ÿ���� ǥ��
 * ���յ��� ���� ���α׷��� ���� ������ ��ư�, ������  ����
 */
public class LgTV implements TV{
//property�� ���
	public String tvname;
	@Override
	public void powerOn() {
		System.out.println(tvname+"LgTV---���� ��");
		
	}

	@Override
	public void powerOff() {
		System.out.println(tvname+"LgTV---���� ��");
		
	}

	@Override
	public void volumUp() {
		System.out.println(tvname+"LgTV---���� �ø�");
		
	}

	@Override
	public void volumDown() {
		System.out.println(tvname+"LgTV---���� ����");
		
	}

	@Override
	public void setTvname(String tvname) {
	//���� ���ؼ� ���Թ���setter�� ������ ��
		this.tvname=tvname;
		
	}
	


}
