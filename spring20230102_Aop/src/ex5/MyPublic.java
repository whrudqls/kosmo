package ex5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyPublic {

	/*
	 * TodayBeforeAdvice에서 MyPublic을  DI를 받아서 Advice에서 적용 시킨다
	 * 
	 * ex4.DaoImple에 정의된 모든 메서드에 선생작업으로 공통관심로직이 적용되도록 수행하시오
	 */
	public String todayMethod() {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		return f.format(new Date());
	}
}
