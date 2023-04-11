package ex3_aop;

import java.util.LinkedList;
//������� ���� : �� �޼��忡�� �������� ���� �ؾ� �� �κ�
public class MessageImple implements Message {

	private String message;

	public MessageImple() {
		message = "�ȳ��ϼ��� ù AOP�Դϴ�.";
	}

	@Override
	public void print() {
		//long start = System.currentTimeMillis(); => ������� ����
		LinkedList<String> ar2 = new LinkedList<String>();
		for (int i = 0; i < 100000; i++) {
			if (i % 5 == 0) {
				ar2.add("Kosmo");
			} else {
				ar2.add("Python");
			}
		}
		System.out.println("LinkedList �� �� size : " + ar2.size());
		for (String e : ar2) {
			String msg = e;
			if (e.equals("Kosmo")) {
				System.out.println(msg);
			}
		}
		//long end = System.currentTimeMillis();
		//System.out.println("�ҿ�ð� : " + (end - start));
	}

	@Override
	public String printTest() {
		//long start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);// ���ָ� �ڵ����� ��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//long end = System.currentTimeMillis();
		//System.out.println("�ҿ�ð� : " + (end - start));
		return "���";
	}

	@Override
	public String msessage() {

		return message;
	}

	@Override
	public void test() {
		System.out.println("test~~~~~");
	}

	@Override
	public void test2() {
		System.out.println("test2~~~~~");
	}

	@Override
	public void test3(String msg) {
		System.out.println("test3~~~~~" + msg);
	}

}
