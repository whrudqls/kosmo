package ex2;

import java.util.Scanner;

//삼성 tv,lg tv를 시청하는 유저 클래스를 만들고
//다형성을 적용해서 결합도를 낮춤
//스캐너,인터페이스를 이용한 출력
public class TVUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ext: while (true) {
			System.out.println("1.삼성  2.Lg 3. 종료");
			int menu = Integer.parseInt(sc.nextLine());
			TV tv = null;//인터페이스 TV 불러오기
			switch (menu) {
			case 1:
				tv = new SamsungTV();//TV tv = null에 new SamsungTV()저장
				tv.powerOn();
				tv.volumUp();
				tv.volumDown();
				tv.powerOff();
				break;
			case 2:
				tv = new LgTV();//TV tv = null에 new LgTV()저장
				tv.powerOn();
				tv.volumUp();
				tv.volumDown();
				tv.powerOff();
				break;
			case 3:
				System.out.println("종료");
				break ext;
			default:
				break;
			}
		}
	
	}
}
