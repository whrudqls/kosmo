package ex3_spring;
//결합도를 낮추는 방법, 다형성 개념 - 인터페이스 사용!
public interface TV {	
public void powerOn();
public void powerOff();
public void volumUp();
public void volumDown();
//스프링에 의해서 값을 주입 받기 위한 setter 추가
public void setTvname(String tvname);
}
