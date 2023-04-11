package ex3;


public class SamsungTV implements TV {

	
	@Override
	public void volumUp() {
	
		System.out.println("SamsungTV---Àü¿ø ÄÔ");
	}

	@Override
	public void volumDown() {
		
		System.out.println("SamsungTV---Àü¿ø ²û");
	}

	@Override
	public void powerOn() {
		
		System.out.println("SamsungTV---º¼·ý ¿Ã¸²");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV---º¼·ý ³»¸²");
		
	}

	

}
