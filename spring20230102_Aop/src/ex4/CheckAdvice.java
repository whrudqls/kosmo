package ex4;

import org.aspectj.lang.ProceedingJoinPoint;

import oracle.sql.LobPlsqlUtil;

//Around Advice -joinpoint�� �ݵ�� �޼����� ���ڷ� ���� �ؾ��Ѵ�
public class CheckAdvice {

	public void checkTime(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();// ���� ������� ����

		// target ��ü�� �޼��带 ȣ��
		pjp.proceed();

		long end = System.currentTimeMillis();// ���� ������� ����
		System.out.println("����� �ӵ� : " + (end - start) + " ��");
	}
}
