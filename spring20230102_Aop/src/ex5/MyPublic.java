package ex5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyPublic {

	/*
	 * TodayBeforeAdvice���� MyPublic��  DI�� �޾Ƽ� Advice���� ���� ��Ų��
	 * 
	 * ex4.DaoImple�� ���ǵ� ��� �޼��忡 �����۾����� ������ɷ����� ����ǵ��� �����Ͻÿ�
	 */
	public String todayMethod() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		return f.format(new Date());
	}
}
