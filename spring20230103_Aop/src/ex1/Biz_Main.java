package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Biz_Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex1/ex1_anno.xml");
		BizService dao = ctx.getBean("target", BizService.class);
		dao.first();
		//dao.second("hello",123);
		//dao.bizMethod1("hello",123);
	}
}
