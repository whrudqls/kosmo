package ex5_property;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex2_MapMain2 {
	public static void main(String[] args) {
		//빈을 상속 받은 것처럼 사용할 수 있음(중요도 낮음)
		//자식의 빈 정보를 읽어온다. 
		ApplicationContext ctx = new GenericXmlApplicationContext("ex5_property/map_child.xml");
		Ex2_Map ref = ctx.getBean("map2",Ex2_Map.class);
		Map<String, String> map = ref.getMap();
		for(Entry<String, String> ent : map.entrySet()) {
			System.out.println(ent.getKey() + ":" + ent.getValue());
		}
		
		
		
	}

}
