package ex3_spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//삼성 tv,lg tv를 시청하는 유저 클래스를 만들고

public class TVUser2 {
	public static void main(String[] args) {
		//ApplicationContext 빈팩토리 확장판-컨테이너에 bean으로 등록 되는 순간 ApplicationContext는 해당 bean을 싱글톤으로 생성한다.
		ApplicationContext ctx = new GenericXmlApplicationContext("ex3_spring/tv.xml");
		Scanner sc = new Scanner(System.in);
		//BeanFactory factory = new BeanFactory();
		ext: while (true) {
			System.out.println("1.삼성  2.Lg 3. 종료");
			int menu = Integer.parseInt(sc.nextLine());
			TV tv = null;
			String tvCmd = "";
			switch (menu) {
			case 1:
				tvCmd = "stv";
				break;
			case 2:
				tvCmd = "ltv";
				break;
			case 3:
				System.out.println("종료");
				break ext;
			default:
				break;
			}
			// ApplicationContext ctx = new GenericXmlApplicationContext("ex3_spring/tv.xml");
			tv = ctx.getBean(tvCmd, TV.class);
			tv.powerOn();
			tv.volumUp();
			tv.volumDown();
			tv.powerOff();
		}
	}
}
