package ex2;

//B를 필요로 하는 A에게 setter 호출해 생성된 B의 주소를 전달하는 역할
public class MyAssembler {
	private String printv;
	public MyAssembler() {
		//외부조립기처럼 구현
		ResourceB refb = new ResourceB();
		MyTestA refa = new MyTestA();
		refb.setUname("길동쓰");
		refa.setB(refb); //주소를 필요한 객체에 전달
		printv = refa.printUseb();
	}
	
	public String getPrintv() {
		return printv;
	}
	
	
}
