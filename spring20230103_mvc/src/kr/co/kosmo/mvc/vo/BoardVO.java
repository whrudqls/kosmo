package kr.co.kosmo.mvc.vo;

/*
 *  <th>번호</th>
     <th>제목</th>
     <th>작성자</th>
     <th>조회수</th>
     <th>작성날짜</th>
 */
public class BoardVO {
	private int num;
	private String title,content,writer,bdate,reip;
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
