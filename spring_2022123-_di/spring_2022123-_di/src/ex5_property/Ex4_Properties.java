package ex5_property;

import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex4_Properties {
	private Properties addrList;

	public Properties getAddrList() {
		return addrList;
	}

	public void setAddrList(Properties addrList) {
		this.addrList = addrList;
	}
	
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex5_property/properties.xml");
		Ex4_Properties prop = ctx.getBean("prop", Ex4_Properties.class);
		//System.out.println(prop.getAddrList());
		System.out.println("=============================");
		Properties proper = prop.getAddrList();
		for(Entry e : proper.entrySet()) {
			System.out.println(e.getKey() +":"+ e.getValue());
		}
		
	
	}
	

}
