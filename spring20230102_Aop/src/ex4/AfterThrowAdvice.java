package ex4;

public class AfterThrowAdvice {
	// JoinPoint jp ���� ����
	// after-returning ���������� ���� ������ �̸��� ������ ���ƾ� ��
	public void commThrow(Exception ew) {
		System.out.println("���� �޽��� : " + ew.getMessage());
	}
}
