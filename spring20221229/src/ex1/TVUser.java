package ex1;

//�Ｚ tv,lg tv�� ��û�ϴ� ���� Ŭ������ �����
public class TVUser {
	//��ü�� ���� �����ؼ� Ÿ Ŭ������ �޼��带 �ҷ���
	public static void main(String[] args) {
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		LgTV tv1 = new LgTV();
		tv1.turnOff();
		tv1.turnOn();
		tv1.soundDown();
		tv1.soundUp();
	}
}
