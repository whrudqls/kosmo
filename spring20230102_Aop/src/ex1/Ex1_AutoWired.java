package ex1;
//AutoWired (자동으로 의존성관련 빈을 DI해주는 기능)어노테이션 기반  --중요하다,많이 쓴다!!!!

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//자동으로 빈을 묶어주는 스프링 API
//예) A가 B를 참조한다. xml에서 ref속성으로 의존 관계를 설정하지 않고 
//	Abean과 Bbean의 의존관계를 자동으로 설정한다.

//bytype(자료형), byname(프로퍼티)에 대한 개념

//byname : 프로퍼티와 자동으로 묶을 bean의 이름이 같을 경우
//생성자, 메서드, 맴버변수 위에다가 정의해서 사용
//스프링에서 제공해주는 어노테이션 상당히 많다.

//bytype : 이름이 같은 bean을 찾는 것이 아니라 타입이 같은 빈을
//찾아온다. 이때 중복된 타입이 있으면 예외가 발생하고
//이럴때는 qualifier 수식어 지정
//어노테이션
//AutoWired -> springfreamwork => AOP기술 적용
//@Resource -> javax.annotation.Resource
//@Inject -> javax.inject.Inject : 라이브러리 추가 필요

//AutoWired -검색을 해주는 기능(요청을 보고 해당 되는지 판단하는것) => AOP

//AutoWired 사용할 때 규칙
//<context : 스피링컨테이너xml에 반드시 정의해야 한다.-네임스페이스에서 체크 해주고 더블 클릭 후 첫번째 
//자동으로 빈을 묶을 맴버필드에 @AutoWired 지정 할 수 있다.

/*
<bean id="" class="">

	<property name="" value:""대신  ref:""도 가능>
		
	</property>
	*/
public class Ex1_AutoWired {
	//맴버 필드에 @Autowired 지정하면 setter가 필요 없다.
	//이름이 매우 중요함, 본인과 같은 이름의 xml bean을 가져와서 연결한다 - byname 
	@Autowired
	@Qualifier("kosmo")
	private String msg;
	
/*
 * 1번째 방법
	@Autowired//프로 퍼티 안 줘도 자동으로 본인과 같은 이름의 xml bean을 가져와서 연결한다
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
