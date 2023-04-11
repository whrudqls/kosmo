package ex2;

public class MyTestA {
	//멤버필드로 받을 객체를 선언
	private ResourceB b;
	public MyTestA() {
		//has a 관계 결합도 높음 
		//b = new ResourceB();
		System.out.println("MyTestA 생성자 호출!");
	}
	
	//외부에서 생성한 후 그 주소값을 주입 받는다. 
	public void setB(ResourceB b) {
		this.b = b;
	}
	
	public String printUseb() {
		StringBuilder sb = new StringBuilder();
		sb.append("B에서 반환 받은 값" + (b.res()*2)).append("<br>");
		sb.append("사용자 이름: ").append(b.getUname());
		return sb.toString();
	}

	
	
}
