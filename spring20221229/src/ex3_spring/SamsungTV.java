package ex3_spring;

/*
 * 결합도(coupling)가 높은 프로그램
 * 결합도란 하나의 클래스가 다른 클래스와 얼마나 많이 연결 되어 있는지를
 * 나타내는 표현
 * 결합도가 높은 프로그램은 유지 보수가 어렵고, 관리도  힘듬
 */
public class SamsungTV implements TV {

	public String tvname;
	@Override
	public void setTvname(String tvname) {
		//빈의 의해서 주입받을setter를 재정의 함
		this.tvname=tvname;
	}

	@Override
	public void volumUp() {
	
		System.out.println("SamsungTV---전원 켬");
	}

	@Override
	public void volumDown() {
		
		System.out.println("SamsungTV---전원 끔");
	}

	@Override
	public void powerOn() {
		
		System.out.println("SamsungTV---볼륨 올림");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV---볼륨 내림");
		
	}

	

}
