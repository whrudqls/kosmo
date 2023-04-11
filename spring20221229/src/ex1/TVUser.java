package ex1;

//삼성 tv,lg tv를 시청하는 유저 클래스를 만들고
public class TVUser {
	//객체를 직접 생성해서 타 클래스의 메서드를 불러옴
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
