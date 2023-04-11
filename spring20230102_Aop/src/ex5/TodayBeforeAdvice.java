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
	공통 관심 사항 - 전처리에서 날짜를 출력하기 위한 메서드
	 */
	public void todayBefore(JoinPoint jp) {
		String msg =mPpublic.todayMethod();
		System.out.println(msg);
		System.out.println("****************************");
	}
	
}
