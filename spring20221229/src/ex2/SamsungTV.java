package ex2;

/*
 * ���յ�(coupling)�� ���� ���α׷�
 * ���յ��� �ϳ��� Ŭ������ �ٸ� Ŭ������ �󸶳� ���� ���� �Ǿ� �ִ�����
 * ��Ÿ���� ǥ��
 * ���յ��� ���� ���α׷��� ���� ������ ��ư�, ������  ����
 */
public class SamsungTV implements TV {

	
	@Override
	public void volumUp() {	
		System.out.println("SamsungTV---���� ��");
	}

	@Override
	public void volumDown() {
		
		System.out.println("SamsungTV---���� ��");
	}

	@Override
	public void powerOn() {
		
		System.out.println("SamsungTV---���� �ø�");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV---���� ����");
		
	}

	

}
