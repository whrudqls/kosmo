package ex5_property;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex3_Set {
	private Set<String> addrList;

	public Set<String> getAddrList() {
		return addrList;
	}

	public void setAddrList(Set<String> addrList) {
		this.addrList = addrList;
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("ex5_property/set.xml");
		Ex3_Set ref = ctx.getBean("set", Ex3_Set.class);
		Set<String> set = ref.getAddrList();
		for(String e : set) {
			System.out.println(e);
		}
	}
	

}
