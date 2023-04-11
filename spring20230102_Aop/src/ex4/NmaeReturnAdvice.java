package ex4;

import org.aspectj.lang.JoinPoint;

//After-returnning 시점을 가지고 targer의 반환 값을 받을 목적으로 주로 사용됨
public class NmaeReturnAdvice {
	// 인자 즉 변수명이 설정과 동일해야 함 Around가 아닌 Joinpoint는 생략이 가능하다
	public void myReturnMethod(JoinPoint jp, Object ret) {// 후 처리

		String namev = jp.getSignature().getName();
		
		System.out.println("Name : " + namev);
		System.out.println("반환값 : " + ret);
		System.out.println("=======================");
	}

}
