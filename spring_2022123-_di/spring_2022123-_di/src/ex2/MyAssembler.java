package ex2;

//B�� �ʿ�� �ϴ� A���� setter ȣ���� ������ B�� �ּҸ� �����ϴ� ����
public class MyAssembler {
	private String printv;
	public MyAssembler() {
		//�ܺ�������ó�� ����
		ResourceB refb = new ResourceB();
		MyTestA refa = new MyTestA();
		refb.setUname("�浿��");
		refa.setB(refb); //�ּҸ� �ʿ��� ��ü�� ����
		printv = refa.printUseb();
	}
	
	public String getPrintv() {
		return printv;
	}
	
	
}
