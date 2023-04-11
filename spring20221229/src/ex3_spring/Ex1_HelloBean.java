package ex3_spring;

public class Ex1_HelloBean {

	private String msg;
	private String nick;

	public Ex1_HelloBean() {
		System.out.println("Hollo 생성자 호출!!!!");
	}

	public String getMsg() {
		return msg;
	}
	// setter 값 주입

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String printMessage() {
		String name = "김길동";
		return name + "님 " + msg;
	}

}
