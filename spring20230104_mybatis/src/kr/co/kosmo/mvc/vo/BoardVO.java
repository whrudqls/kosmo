package kr.co.kosmo.mvc.vo;

/*
 *  <th>��ȣ</th>
     <th>����</th>
     <th>�ۼ���</th>
     <th>��ȸ��</th>
     <th>�ۼ���¥</th>
 */
public class BoardVO {
	private int num,no;
	private String title,subject,writer,content,contents,reip,bdate,regdate;
	//content,title  demo��
	//subject,contents db��
	
	
	public String getContents() {
		return contents;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public String getReip() {
		return reip;
	}
	public void setReip(String reip) {
		this.reip = reip;
	}
	
}
