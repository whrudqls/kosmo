package ex3_aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
//���� ������ �����ϴ� �ɷ�
//Advice Ŭ���� : ���� ���� ������ ���� �� ���� Ŭ����
public class Ex1_MessageAdvice implements MethodInterceptor {

	// MethodInterceptor invocation Ÿ���� �޼����� ȣ�� ������ ������ �ִ� ��ü�� ���ڷ� ���� ����
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		System.out.println("����� ���� �����Ͻ� ������ �����!!!");

		Object rev = invocation.proceed();// Ÿ���� �޼��带 ȣ��
		if (rev != null) {
			System.out.println("REV : " + rev);
		}

		System.out.println("����� ���� �����Ͻ� ������ �����!!!");

		return rev;
	}

}
