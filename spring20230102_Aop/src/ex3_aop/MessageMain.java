package ex3_aop;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
//MessageAdvice2에서 start,end 및 타임 연산을 하는 advice를 제작해보시오
public class MessageMain {
	public static void main(String[] args) {
		
		//requestA => 		filter(Advice)  		=>ATarget
		ProxyFactoryBean pfBean = new ProxyFactoryBean();
		
		//Target의 정보를 ProxyFactory에게 저장
		pfBean.setTarget(new MessageImple());
		
		//Advice 를 지정한다.
		//pfBean.addAdvice(new Ex1_MessageAdvice());
		//pfBean.addAdvice(new MessageAdvice2());
		
		
		//pointcut 이란 정규 표현식 등을 사용해서 , Advice를 적용할 대상을
		//선택 하고자 할 때 사용함
		NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();//골라서 사용하고 싶을때 사용
		//NameMatchMethodPointcut 이름이 같은 아이
		
		//target이 가지고 있는 메서드 이름을 대상으로 선정할 수 있다.
		pointcut.setMappedName("print*");//프린트로 시작하는 메서드는 모두 다 실행하겠다
		
		//Advice 와 Pointcut의 결합  => Advisors
		pfBean.addAdvisors(new DefaultPointcutAdvisor(pointcut,new MessageAdvice2()));;
		
		
		//request 를 요청 해본다.
		Message prMessage = (Message) pfBean.getObject();
		//prMessage.test();
		prMessage.printTest();		
		
		//Message messageInter = new MessageImple();
		//messageInter.print();
		
		//messageInter.printTest();
	}



}
