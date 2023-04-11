package ex3_aop;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
//MessageAdvice2���� start,end �� Ÿ�� ������ �ϴ� advice�� �����غ��ÿ�
public class MessageMain {
	public static void main(String[] args) {
		
		//requestA => 		filter(Advice)  		=>ATarget
		ProxyFactoryBean pfBean = new ProxyFactoryBean();
		
		//Target�� ������ ProxyFactory���� ����
		pfBean.setTarget(new MessageImple());
		
		//Advice �� �����Ѵ�.
		//pfBean.addAdvice(new Ex1_MessageAdvice());
		//pfBean.addAdvice(new MessageAdvice2());
		
		
		//pointcut �̶� ���� ǥ���� ���� ����ؼ� , Advice�� ������ �����
		//���� �ϰ��� �� �� �����
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();//��� ����ϰ� ������ ���
		//NameMatchMethodPointcut �̸��� ���� ����
		
		//target�� ������ �ִ� �޼��� �̸��� ������� ������ �� �ִ�.
		pointcut.setMappedName("print*");//����Ʈ�� �����ϴ� �޼���� ��� �� �����ϰڴ�
		
		//Advice �� Pointcut�� ����  => Advisors
		pfBean.addAdvisors(new DefaultPointcutAdvisor(pointcut,new MessageAdvice2()));;
		
		
		//request �� ��û �غ���.
		Message prMessage = (Message) pfBean.getObject();
		//prMessage.test();
		prMessage.printTest();		
		
		//Message messageInter = new MessageImple();
		//messageInter.print();
		
		//messageInter.printTest();
	}



}
