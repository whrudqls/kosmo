package ex3_spring;

import java.util.Scanner;

//삼성 tv,lg tv를 시청하는 유저 클래스를 만들고

public class TVUser {
	public static void main(String[] args) {
	
		//BeanFactory 사용한 것
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
