package ex2;

public class MyTestA {
	//����ʵ�� ���� ��ü�� ����
	private ResourceB b;
	public MyTestA() {
		//has a ���� ���յ� ���� 
		//b = new ResourceB();
		System.out.println("MyTestA ������ ȣ��!");
	}
	
	//�ܺο��� ������ �� �� �ּҰ��� ���� �޴´�. 
	public void setB(ResourceB b) {
		this.b = b;
	}
	
	public String printUseb() {
		StringBuilder sb = new StringBuilder();
		sb.append("B���� ��ȯ ���� ��" + (b.res()*2)).append("<br>");
		sb.append("����� �̸�: ").append(b.getUname());
		return sb.toString();
	}

	
	
}
