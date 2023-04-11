package ex1;

public class BizServiceImple implements BizService {

	@Override
	public void first() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);// 쳐주면 자동으로 뜸
				System.out.println(i + " ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public void bizMethod1(String msg,int num) {
		System.out.println("수행!");
		System.out.println(msg+num);
	}

	@Override
	public String second(String msg,int num) {
		StringBuffer sb = new StringBuffer();
		sb.append("=============================").append("|n");
		sb.append("김길동").append("|n");
		sb.append(msg).append("|n");
		sb.append(num).append("|n");
		sb.append("=============================").append("|n");
		return sb.toString();
	}

}
