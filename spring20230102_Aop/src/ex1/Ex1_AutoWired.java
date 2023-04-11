package ex1;
//AutoWired (�ڵ����� ���������� ���� DI���ִ� ���)������̼� ���  --�߿��ϴ�,���� ����!!!!

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//�ڵ����� ���� �����ִ� ������ API
//��) A�� B�� �����Ѵ�. xml���� ref�Ӽ����� ���� ���踦 �������� �ʰ� 
//	Abean�� Bbean�� �������踦 �ڵ����� �����Ѵ�.

//bytype(�ڷ���), byname(������Ƽ)�� ���� ����

//byname : ������Ƽ�� �ڵ����� ���� bean�� �̸��� ���� ���
//������, �޼���, �ɹ����� �����ٰ� �����ؼ� ���
//���������� �������ִ� ������̼� ����� ����.

//bytype : �̸��� ���� bean�� ã�� ���� �ƴ϶� Ÿ���� ���� ����
//ã�ƿ´�. �̶� �ߺ��� Ÿ���� ������ ���ܰ� �߻��ϰ�
//�̷����� qualifier ���ľ� ����
//������̼�
//AutoWired -> springfreamwork => AOP��� ����
//@Resource -> javax.annotation.Resource
//@Inject -> javax.inject.Inject : ���̺귯�� �߰� �ʿ�

//AutoWired -�˻��� ���ִ� ���(��û�� ���� �ش� �Ǵ��� �Ǵ��ϴ°�) => AOP

//AutoWired ����� �� ��Ģ
//<context : ���Ǹ������̳�xml�� �ݵ�� �����ؾ� �Ѵ�.-���ӽ����̽����� üũ ���ְ� ���� Ŭ�� �� ù��° 
//�ڵ����� ���� ���� �ɹ��ʵ忡 @AutoWired ���� �� �� �ִ�.

/*
<bean id="" class="">

	<property name="" value:""���  ref:""�� ����>
		
	</property>
	*/
public class Ex1_AutoWired {
	//�ɹ� �ʵ忡 @Autowired �����ϸ� setter�� �ʿ� ����.
	//�̸��� �ſ� �߿���, ���ΰ� ���� �̸��� xml bean�� �����ͼ� �����Ѵ� - byname 
	@Autowired
	@Qualifier("kosmo")
	private String msg;
	
/*
 * 1��° ���
	@Autowired//���� ��Ƽ �� �൵ �ڵ����� ���ΰ� ���� �̸��� xml bean�� �����ͼ� �����Ѵ�
	public void setMsg(String msg) {
		this.msg = msg;
	}
*/
	public String getMessage() {
		StringBuffer sb = new StringBuffer();
		sb.append("<p style ='color:blue'>");
		sb.append(msg);
		sb.append("</p>");
		return sb.toString();
	}
}
