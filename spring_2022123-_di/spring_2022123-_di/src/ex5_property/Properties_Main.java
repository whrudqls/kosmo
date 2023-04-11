package ex5_property;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Properties_Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex5_property/properties.xml");
		Ex4_Properties ref = ctx.getBean("prop",Ex4_Properties.class);
		/*
		Properties prop = ref.getAddrList();
		for(Entry e : prop.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());	
		}
		*/
		
		ref.getAddrList().list(System.out);
	}
}
