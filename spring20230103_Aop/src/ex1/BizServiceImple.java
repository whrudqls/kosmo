package ex1;

public class BizServiceImple implements BizService {

	@Override
	public void first() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);// ���ָ� �ڵ����� ��
				System.out.println(i + " ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public void bizMethod1(String msg,int num) {
		System.out.println("����!");
		System.out.println(msg+num);
	}

	@Override
	public String second(String msg,int num) {
		StringBuffer sb = new StringBuffer();
		sb.append("=============================").append("|n");
		sb.append("��浿").append("|n");
		sb.append(msg).append("|n");
		sb.append(num).append("|n");
		sb.append("=============================").append("|n");
		return sb.toString();
	}

}
