package ex2;

import java.util.Scanner;

//�Ｚ tv,lg tv�� ��û�ϴ� ���� Ŭ������ �����
//�������� �����ؼ� ���յ��� ����
//��ĳ��,�������̽��� �̿��� ���
public class TVUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ext: while (true) {
			System.out.println("1.�Ｚ  2.Lg 3. ����");
			int menu = Integer.parseInt(sc.nextLine());
			TV tv = null;//�������̽� TV �ҷ�����
			switch (menu) {
			case 1:
				tv = new SamsungTV();//TV tv = null�� new SamsungTV()����
				tv.powerOn();
				tv.volumUp();
				tv.volumDown();
				tv.powerOff();
				break;
			case 2:
				tv = new LgTV();//TV tv = null�� new LgTV()����
				tv.powerOn();
				tv.volumUp();
				tv.volumDown();
				tv.powerOff();
				break;
			case 3:
				System.out.println("����");
				break ext;
			default:
				break;
			}
		}
	
	}
}
