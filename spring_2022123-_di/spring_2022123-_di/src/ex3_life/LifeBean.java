package ex3_life;

/*
 * ������ ������ ����Ŭ�� WAS�� Servlet��ü�� ������ �� �⺻ �����ڸ� ȣ���Ѵ�.
 * �����ڷ� ���� ��ü�� ����ʵ��� �����ؼ� �ʱ�ȭ�ϱ� ���ؼ��� this(aa,10)���� ����ؾ� �ϴ´�
 * ��, ������� �ʱ�ȭ�� �� ������ �ִ�.
 * �׷��� init()�޼��带 ���ؼ� ������() --> init()�� ȣ���� �� �ְ�, context-param, init-param� ���⼭ ȣ���Ѵ�.
 * 
 * ������ �����̳� ���� �������� ���� ���Ͽ� ��ϵ� Ŭ�������� ��ü�� ������ �� �⺻�����ڸ� ȣ���Ѵ�.(���� ����)
 * ��ü ���� �Ŀ� ���� �ʱ�ȭ, DI�� ������ �� �����ϸ鼭 ����Ͻ� ������ �����ؾ��ϴ� ���� �����̴�.
 * init:�ʱ�ȭ,destroy(����)
 * Bean -> init-method, destroy-method ȣ�� (�Ӽ� ����)
 * 
 */


public class LifeBean implements LifeInter{
	private String name;
	public LifeBean(String name) {
		this.name = name;
		System.out.println("������ ȣ��: "+name);
	}
	
	

	public void setName(String name) {
		this.name = name;
		System.out.println("setter ȣ��");
	}



	@Override
	public void init() {
		System.out.println("init ȣ��");
		
	}

	@Override
	public void destroy() {
		System.out.println("destroy ȣ��");
		
	}

	@Override
	public String method1() {
		System.out.println("name: "+name);
		return name;
	}

}
