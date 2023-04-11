package ex4;

public class AfterThrowAdvice {
	// JoinPoint jp 생략 가능
	// after-returning 마찬가지로 지역 변수의 이름과 설정이 같아야 함
	public void commThrow(Exception ew) {
		System.out.println("예외 메시지 : " + ew.getMessage());
	}
}
