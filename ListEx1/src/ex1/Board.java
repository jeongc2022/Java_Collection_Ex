package ex1;

public class Board {		// 게시물 클래스
	private String title;
	private String content;
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	public String getTitle() { return title; }
	public String getContent() { return content; }
}
