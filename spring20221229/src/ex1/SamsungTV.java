package ex1;

/*
 * ���յ�(coupling)�� ���� ���α׷�
 * ���յ��� �ϳ��� Ŭ������ �ٸ� Ŭ������ �󸶳� ���� ���� �Ǿ� �ִ�����
 * ��Ÿ���� ǥ��
 * ���յ��� ���� ���α׷��� ���� ������ ��ư�, ������  ����
 */
public class SamsungTV {

	public void powerOn() {
		System.out.println("SamsungTV---���� ��");
	}

	public void powerOff() {
		System.out.println("SamsungTV---���� ��");
	}

	public void volumeUp() {
		System.out.println("SamsungTV---���� �ø�");
	}

	public void volumeDown() {
		System.out.println("SamsungTV---���� ����");
	}

}
