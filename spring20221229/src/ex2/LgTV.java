package ex2;

/*
 * ���յ�(coupling)�� ���� ���α׷�
 * ���յ��� �ϳ��� Ŭ������ �ٸ� Ŭ������ �󸶳� ���� ���� �Ǿ� �ִ�����
 * ��Ÿ���� ǥ��
 * ���յ��� ���� ���α׷��� ���� ������ ��ư�, ������  ����
 */
public class LgTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("LgTV---���� ��");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV---���� ��");
		
	}

	@Override
	public void volumUp() {
		System.out.println("LgTV---���� �ø�");
		
	}

	@Override
	public void volumDown() {
		System.out.println("LgTV---���� ����");
		
	}
	


}
