package ex3;
//ObjectFactory ������ ������ ����ؼ� å�� �и�
//��û�� ���� ��ü�� �����ϰ� �������̽��� �����Ͽ� ��ȯ�ϴ�, �� Bean�� �����ϰ� �����ϴ� ���� ���
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
