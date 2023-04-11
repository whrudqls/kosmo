package ex5_property;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex2_MapMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex5_property/map.xml");
		Ex2_Map ref = ctx.getBean("map",Ex2_Map.class);
		
		
		Map<String, String> map = ref.getMap();
		for(Entry<String, String> ent : map.entrySet()) {
			System.out.println(ent.getKey() + ":" + ent.getValue());
		}
		
		
		
	}

}
