package ex3_aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
//원리 정도만 이해하는 걸로
//Advice 클래스 : 공통 관심 사항을 정의 해 놓은 클래스
public class Ex1_MessageAdvice implements MethodInterceptor {

	// MethodInterceptor invocation 타겟의 메서드의 호출 정보를 가지고 있는 객체를 인자로 주입 받음
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		System.out.println("선행될 공통 비지니스 로직이 수행됨!!!");

		Object rev = invocation.proceed();// 타겟의 메서드를 호출
		if (rev != null) {
			System.out.println("REV : " + rev);
		}

		System.out.println("선행될 공통 비지니스 로직이 수행됨!!!");

		return rev;
	}

}
