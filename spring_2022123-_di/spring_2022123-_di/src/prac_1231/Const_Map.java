package prac_1231;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Const_Map {
	private String str1;
	private String str2;
	
	public Const_Map(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("prac_1231/constMap.xml");
		Const_Map ref = ctx.getBean("map",Const_Map.class);
		Map<String, String> map = new HashMap<String, String>();
		map.put(ref.getStr1(), ref.getStr2());
		for(Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}
}
