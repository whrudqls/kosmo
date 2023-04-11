package advice;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//<aop:config> 즉 ProxyFactoryBean 선언
//xml에서 <aop:aspectj-autoproxy/>를 설정 후 아래의 Aspect 지정
@Aspect//삭제하면 어드바이스가 아니다
public class BizAdvice {
	// 전처리로 즉 beforeAdvice를 적용하기 위한 메서드
	// BizeService의 모든 메서드에 적용하기로 했다. => pointcut으로 사용
	@Before("execution(* ex1.BizServiceImple.*(..))")
	public void beforeMethod(JoinPoint jp) {
		String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		System.out.println("오늘의 날짜 : " + today);
	}

	@AfterReturning(pointcut = "execution(* ex1.BizServiceImple.second(..))", returning = "ret")
	public void myReturnMethod(JoinPoint jp, Object ret) {//JoinPoint -> 포인트컷의 경로를 알려고 쓰지만 굳이 안써도 실행은 가능하다,하지만 써야 알 수 있기에 써야 한다.
		String namev = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		System.out.println("Name : " + namev);
		System.out.println("반환값 : " + ret);
		System.out.println("Args 중요하다: " + args);
		//메소드를 호출할 때 넘겨준 인자 목록을 object 배열로 리턴
		for (Object e : args) {
			System.out.println(e);
		}

	}

	@Around("execution(* ex1.BizServiceImple.first(..))")
	public void myaroundMethod(ProceedingJoinPoint pip) {
		long start = System.currentTimeMillis();// 선행 공통관심 사항
		
		try {
			pip.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();// 후행 공통관심 사항
		System.out.println("소요시간 : " + (end - start) + " 초");
	}
}
