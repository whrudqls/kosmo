package ex3_spring;

public class Ex1_HelloBean {

	private String msg;
	private String nick;

	public Ex1_HelloBean() {
		System.out.println("Hollo ������ ȣ��!!!!");
	}

	public String getMsg() {
		return msg;
	}
	// setter �� ����

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String printMessage() {
		String name = "��浿";
		return name + "�� " + msg;
	}

}
