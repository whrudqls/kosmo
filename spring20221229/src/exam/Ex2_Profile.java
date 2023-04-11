package exam;

public class Ex2_Profile {

	private String name;	
	private int age;


	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String printProfile() {
		
		return name+"님의 나이는 "+age;
	}

}
