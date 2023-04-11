package ex1;

/*
 * lazy-init=:"true" �Ӽ��� �ο��ϴ� ��� ������ �����̳ʿ� bean�� �ҷ����� ��������
 * �����Ǵ� ���� �ƴϴ�. getBean()�� ����� ȣ���ϴ� �������� ��ü�� �����ϵ��� ������
 * ����ϰ� ������ ���� bean�� ��� ����
 */


public class LazyBean {
	private String msg;
	public LazyBean() {
		System.out.println("LazyBean ������ ȣ��");
	}

	
	public void setMsg(String msg) {
		this.msg = msg;
	}


	public String printMsg() {
		return msg;
	}

}
