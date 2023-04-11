package ex4;

import org.aspectj.lang.JoinPoint;

//After-returnning ������ ������ targer�� ��ȯ ���� ���� �������� �ַ� ����
public class NmaeReturnAdvice {
	// ���� �� �������� ������ �����ؾ� �� Around�� �ƴ� Joinpoint�� ������ �����ϴ�
	public void myReturnMethod(JoinPoint jp, Object ret) {// �� ó��

		String namev = jp.getSignature().getName();
		
		System.out.println("Name : " + namev);
		System.out.println("��ȯ�� : " + ret);
		System.out.println("=======================");
	}

}
