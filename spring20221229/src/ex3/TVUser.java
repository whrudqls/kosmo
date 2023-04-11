package ex3;

import java.util.Scanner;

//삼성 tv,lg tv를 시청하는 유저 클래스를 만들고

public class TVUser {
	public static void main(String[] args) {
		
		//결합도가 쪼끔 낮아짐
		//BeanFactory 사용한 것- 스프링 컨테이너 중 하나
		//요청에 따른 객체를 생성하고 인터페이스를 결합하여 반환하는, 즉 Bean을 생성하고 관리하는 역할 담당
		Scanner sc = new Scanner(System.in);
		BeanFactory factory = new BeanFactory();
		ext: while (true) {
			System.out.println("1.삼성  2.Lg 3. 종료");
			int menu = Integer.parseInt(sc.nextLine());
			TV tv = null;
			String tvcmd ="";			
			switch (menu) {
			case 1:
				tvcmd ="samsung";				
				break;
			case 2:
				tvcmd ="lg";
				break;
			case 3:
				System.out.println("종료");
				break ext;
			default:
				break;
			}
			tv= factory.getBean(tvcmd);
			tv.powerOn();
			tv.volumUp();
			tv.volumDown();
			tv.powerOff();
		}
	}
}
