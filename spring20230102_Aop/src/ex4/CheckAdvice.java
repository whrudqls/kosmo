package ex4;

import org.aspectj.lang.ProceedingJoinPoint;

import oracle.sql.LobPlsqlUtil;

//Around Advice -joinpoint가 반드시 메서드의 인자로 선언 해야한다
public class CheckAdvice {

	public void checkTime(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();// 선행 공통관심 사항

		// target 객체의 메서드를 호출
		pjp.proceed();

		long end = System.currentTimeMillis();// 후행 공통관심 사항
		System.out.println("수행된 속도 : " + (end - start) + " 초");
	}
}
