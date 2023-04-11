package ex2;

//자원을 다루는 객체 ex) ResourceB - Dao
public class ResourceB {
	private String uname;
	public ResourceB() {
		System.out.println("Resource가 생성됨!");
	}
	
	//사용자 이름을 외부에서 받아옴 --> 이 메서드가 호출될 때 값을 인자로 전달 받음
	public String getUname() {
		return uname+"님의 정보입니다.";
	}
	//멤버필드에 저장하는 메서드 
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	//특정 수를 돌려주는 메서드
	public int res() {
		return 10000;
	}
	

}
