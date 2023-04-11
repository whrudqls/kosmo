package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

//spring container���� ���Թ��� �� => property
public class LocalToday {
	private String loc;
	private String name;

	public LocalToday() {
		// ���� ��ü �ʱ�ȭ
		System.out.println("���� ������ ȣ��!");
	}

	// spring�� ���� string ���ڿ� ���� ���Թޱ� ���� setter => property�� ����
	public void setLoc(String loc) {
		this.loc = loc;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	// Bean�� �����������̳ʿ� ���� �����ǰ� �� �� ���� �޼���
	public String printLocaltoday() {
		SimpleDateFormat af = new SimpleDateFormat("yyyy-MM-dd");
		String msg = "�̸�: " + name + " / ����: " + loc + ":" + af.format(new Date());
		System.out.println(name);
		System.out.println(msg);
		return msg;
	}

}
