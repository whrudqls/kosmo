package ex3_spring;

import java.util.Scanner;

//�Ｚ tv,lg tv�� ��û�ϴ� ���� Ŭ������ �����

public class TVUser {
	public static void main(String[] args) {
	
		//BeanFactory ����� ��
		Scanner sc = new Scanner(System.in);
		BeanFactory factory = new BeanFactory();
		ext: while (true) {
			System.out.println("1.�Ｚ  2.Lg 3. ����");
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
				System.out.println("����");
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
