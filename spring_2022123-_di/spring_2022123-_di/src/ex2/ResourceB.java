package ex2;

//�ڿ��� �ٷ�� ��ü ex) ResourceB - Dao
public class ResourceB {
	private String uname;
	public ResourceB() {
		System.out.println("Resource�� ������!");
	}
	
	//����� �̸��� �ܺο��� �޾ƿ� --> �� �޼��尡 ȣ��� �� ���� ���ڷ� ���� ����
	public String getUname() {
		return uname+"���� �����Դϴ�.";
	}
	//����ʵ忡 �����ϴ� �޼��� 
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	//Ư�� ���� �����ִ� �޼���
	public int res() {
		return 10000;
	}
	

}
