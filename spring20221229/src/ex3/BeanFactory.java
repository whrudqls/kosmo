package ex3;
//ObjectFactory 디자인 패턴을 사용해서 책임 분리
//요청에 따른 객체를 생성하고 인터페이스를 결합하여 반환하는, 즉 Bean을 생성하고 관리하는 역할 담당
//
public class BeanFactory {
public TV getBean(String beanNmae) {
	TV tv = null;
	if(beanNmae.equals("samsung")) {
		tv = new SamsungTV();
	}else if(beanNmae.equals("lg")) {
		tv = new LgTV();
	}
	return tv;
}
}
