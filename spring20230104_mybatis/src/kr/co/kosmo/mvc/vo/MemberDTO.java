package kr.co.kosmo.mvc.vo;

/*
 * NUM	NUMBER(10,0)
ID	VARCHAR2(15 BYTE)
PWD	NUMBER(19,0)
NAME	VARCHAR2(34 BYTE)
AGE	NUMBER(5,0)
GENDER	VARCHAR2(6 BYTE)
MDATE	DATE
 */
public class MemberDTO {

	private int num,age;
	private String id,pwd,name,gender,mdate;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMdate() {
		return mdate;
	}
	public void setMdate(String mdate) {
		this.mdate = mdate;
	}
	
}
