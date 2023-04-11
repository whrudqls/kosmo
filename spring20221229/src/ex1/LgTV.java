package ex1;

/*
 * 결합도(coupling)가 높은 프로그램
 * 결합도란 하나의 클래스가 다른 클래스와 얼마나 많이 연결 되어 있는지를
 * 나타내는 표현
 * 결합도가 높은 프로그램은 유지 보수가 어렵고, 관리도  힘듬
 */
public class LgTV {

	public void turnOn() {
		System.out.println("LgTV---전원 켬");
	}

	public void turnOff() {
		System.out.println("LgTV---전원 끔");
	}

	public void soundUp() {
		System.out.println("LgTV---볼륨 올림");
	}

	public void soundDown() {
		System.out.println("LgTV---볼륨 내림");
	}

}
