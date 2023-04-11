package ex2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

public class Ex1_Resource {
	//name alias를 사용해서 불러와 자동 빈 묶기를 함
	@Resource(name = "res2") // 스프링것이 아니고 자바의 어노테이션을 가져와서 쓴다
	//@Qualifier("bb")
	private Ex1_MyResource res;

	/*
	 * public void setRes(Ex1_MyResource res) { this.res = res; }
	 */

	public Ex1_MyResource getRes() {
		return res;
	}

}
