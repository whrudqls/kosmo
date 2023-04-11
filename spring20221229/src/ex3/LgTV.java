package ex3;


public class LgTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("LgTV---Àü¿ø ÄÔ");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV---Àü¿ø ²û");
		
	}

	@Override
	public void volumUp() {
		System.out.println("LgTV---º¼·ý ¿Ã¸²");
		
	}

	@Override
	public void volumDown() {
		System.out.println("LgTV---º¼·ý ³»¸²");
		
	}
	


}
