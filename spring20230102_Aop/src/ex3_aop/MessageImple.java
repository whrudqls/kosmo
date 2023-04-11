package ex3_aop;

import java.util.LinkedList;
//공통관심 사항 : 각 메서드에서 공통으로 구현 해야 할 부분
public class MessageImple implements Message {

	private String message;

	public MessageImple() {
		message = "안녕하세요 첫 AOP입니다.";
	}

	@Override
	public void print() {
		//long start = System.currentTimeMillis(); => 공통관심 사항
		LinkedList<String> ar2 = new LinkedList<String>();
		for (int i = 0; i < 100000; i++) {
			if (i % 5 == 0) {
				ar2.add("Kosmo");
			} else {
				ar2.add("Python");
			}
		}
		System.out.println("LinkedList 에 들어간 size : " + ar2.size());
		for (String e : ar2) {
			String msg = e;
			if (e.equals("Kosmo")) {
				System.out.println(msg);
			}
		}
		//long end = System.currentTimeMillis();
		//System.out.println("소요시간 : " + (end - start));
	}

	@Override
	public String printTest() {
		//long start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);// 쳐주면 자동으로 뜸
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//long end = System.currentTimeMillis();
		//System.out.println("소요시간 : " + (end - start));
		return "헬로";
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
