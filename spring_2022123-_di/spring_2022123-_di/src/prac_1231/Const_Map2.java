package prac_1231;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Const_Map2 {
	private Map<String, String> map;
	public Const_Map2(Map<String, String> map) {
		//this.map = map;
		for(Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
		
	}
	
	public Map<String, String> getMap() {
		return map;
	}
	
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("prac_1231/constMap.xml");
		Const_Map2 ref = ctx.getBean("map2",Const_Map2.class);
//		Map<String, String> map = ref.getMap();
//		for(Entry<String, String> e : map.entrySet()) {
//			System.out.println(e.getKey() + ":" + e.getValue());
//		}
	}

}
