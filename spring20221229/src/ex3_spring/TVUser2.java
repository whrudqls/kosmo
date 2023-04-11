package ex3_spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//�Ｚ tv,lg tv�� ��û�ϴ� ���� Ŭ������ �����

public class TVUser2 {
	public static void main(String[] args) {
		//ApplicationContext �����丮 Ȯ����-�����̳ʿ� bean���� ��� �Ǵ� ���� ApplicationContext�� �ش� bean�� �̱������� �����Ѵ�.
		ApplicationContext ctx = new GenericXmlApplicationContext("ex3_spring/tv.xml");
		Scanner sc = new Scanner(System.in);
		//BeanFactory factory = new BeanFactory();
		ext: while (true) {
			System.out.println("1.�Ｚ  2.Lg 3. ����");
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
				System.out.println("����");
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
