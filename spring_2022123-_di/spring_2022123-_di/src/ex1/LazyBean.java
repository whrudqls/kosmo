package ex1;

/*
 * lazy-init=:"true" 속성을 부여하는 경우 스프링 컨테이너에 bean을 불러오는 시점에서
 * 생성되는 것이 아니다. getBean()을 사용해 호출하는 시점에서 객체를 생성하도록 설정함
 * 빈번하게 사용되지 않은 bean일 경우 적용
 */


public class LazyBean {
	private String msg;
	public LazyBean() {
		System.out.println("LazyBean 생성자 호출");
	}

	
	public void setMsg(String msg) {
		this.msg = msg;
	}


	public String printMsg() {
		return msg;
	}

}
