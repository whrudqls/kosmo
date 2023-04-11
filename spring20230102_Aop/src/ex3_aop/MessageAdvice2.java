package ex3_aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


//St1) 공통 관심사항을 분리 해내서 Advice로 설계한다. 시점을 정해야 한다
//St2)패턴을 생각해서 해당 advice가 적용할 대상을 정의할 때 고민
//St3)ProxyFactoryBean(캡술화)에게 pointCut으로 패턴을 적용해서
//관점지향이 적용 되도록 (JoingPoint)한다
public class MessageAdvice2 implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		//System.out.println("선행 조건 잘 나오나");
		long start = System.currentTimeMillis();
		//JoingPoint : proceed()를 생략 할 수 없음
		//proceed= >타겟의 메서드를 가져와서 호출해준다
		Object rex = invocation.proceed();
		if(rex != null) {
			System.out.println("REX : "+rex);
		}
		long end = System.currentTimeMillis();
		//System.out.println("후행 조건 잘 나오나");
		return rex;
	}

}
