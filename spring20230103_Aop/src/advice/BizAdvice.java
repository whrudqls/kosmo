package advice;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//<aop:config> �� ProxyFactoryBean ����
//xml���� <aop:aspectj-autoproxy/>�� ���� �� �Ʒ��� Aspect ����
@Aspect//�����ϸ� �����̽��� �ƴϴ�
public class BizAdvice {
	// ��ó���� �� beforeAdvice�� �����ϱ� ���� �޼���
	// BizeService�� ��� �޼��忡 �����ϱ�� �ߴ�. => pointcut���� ���
	@Before("execution(* ex1.BizServiceImple.*(..))")
	public void beforeMethod(JoinPoint jp) {
		String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		System.out.println("������ ��¥ : " + today);
	}

	@AfterReturning(pointcut = "execution(* ex1.BizServiceImple.second(..))", returning = "ret")
	public void myReturnMethod(JoinPoint jp, Object ret) {//JoinPoint -> ����Ʈ���� ��θ� �˷��� ������ ���� �Ƚᵵ ������ �����ϴ�,������ ��� �� �� �ֱ⿡ ��� �Ѵ�.
		String namev = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		System.out.println("Name : " + namev);
		System.out.println("��ȯ�� : " + ret);
		System.out.println("Args �߿��ϴ�: " + args);
		//�޼ҵ带 ȣ���� �� �Ѱ��� ���� ����� object �迭�� ����
		for (Object e : args) {
			System.out.println(e);
		}

	}

	@Around("execution(* ex1.BizServiceImple.first(..))")
	public void myaroundMethod(ProceedingJoinPoint pip) {
		long start = System.currentTimeMillis();// ���� ������� ����
		
		try {
			pip.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();// ���� ������� ����
		System.out.println("�ҿ�ð� : " + (end - start) + " ��");
	}
}
