package ex5;


import org.aspectj.lang.JoinPoint;
import org.springframework.beans.factory.annotation.Autowired;

public class TodayBeforeAdvice {
	@Autowired
	public MyPublic mPpublic;
	/*
	public void setMyPublic(MyPublic mypublic) {
		this.mypublic=mypublic;
	}
	���� ���� ���� - ��ó������ ��¥�� ����ϱ� ���� �޼���
	 */
	public void todayBefore(JoinPoint jp) {
		String msg =mPpublic.todayMethod();
		System.out.println(msg);
		System.out.println("****************************");
	}
	
}
