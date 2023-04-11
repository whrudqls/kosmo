package ex3_aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


//St1) ���� ���ɻ����� �и� �س��� Advice�� �����Ѵ�. ������ ���ؾ� �Ѵ�
//St2)������ �����ؼ� �ش� advice�� ������ ����� ������ �� ���
//St3)ProxyFactoryBean(ĸ��ȭ)���� pointCut���� ������ �����ؼ�
//���������� ���� �ǵ��� (JoingPoint)�Ѵ�
public class MessageAdvice2 implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		//System.out.println("���� ���� �� ������");
		long start = System.currentTimeMillis();
		//JoingPoint : proceed()�� ���� �� �� ����
		//proceed= >Ÿ���� �޼��带 �����ͼ� ȣ�����ش�
		Object rex = invocation.proceed();
		if(rex != null) {
			System.out.println("REX : "+rex);
		}
		long end = System.currentTimeMillis();
		//System.out.println("���� ���� �� ������");
		return rex;
	}

}
