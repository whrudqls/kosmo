package ex2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

public class Ex1_Resource {
	//name alias�� ����ؼ� �ҷ��� �ڵ� �� ���⸦ ��
	@Resource(name = "res2") // ���������� �ƴϰ� �ڹ��� ������̼��� �����ͼ� ����
	//@Qualifier("bb")
	private Ex1_MyResource res;

	/*
	 * public void setRes(Ex1_MyResource res) { this.res = res; }
	 */

	public Ex1_MyResource getRes() {
		return res;
	}

}
