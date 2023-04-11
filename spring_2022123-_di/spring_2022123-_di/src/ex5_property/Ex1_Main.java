package ex5_property;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex1_Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex5_property/list.xml");
		Ex1_ListDemo ref = ctx.getBean("list", Ex1_ListDemo.class);
		List<String> list = ref.getStlist();
		for (String e : list) {
			System.out.println(e);
		}
	}
}
