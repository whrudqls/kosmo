package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

//spring container에서 주입받을 값 => property
public class LocalToday {
	private String loc;
	private String name;

	public LocalToday() {
		// 현재 객체 초기화
		System.out.println("로컬 생성자 호출!");
	}

	// spring에 의해 string 문자열 값을 주입받기 위한 setter => property에 적용
	public void setLoc(String loc) {
		this.loc = loc;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	// Bean이 스프링컨테이너에 의해 생성되고 난 후 사용될 메서드
	public String printLocaltoday() {
		SimpleDateFormat af = new SimpleDateFormat("yyyy-MM-dd");
		String msg = "이름: " + name + " / 지역: " + loc + ":" + af.format(new Date());
		System.out.println(name);
		System.out.println(msg);
		return msg;
	}

}
