package ex1;

import java.util.List;

public class ListExample {		// BoardDao 사용자 클래스입니다.
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}

/*
 * BoardDao 객체의 getBoardList() 메소드를 호출하면 List<Board> 타입의 컬렉션을 리턴합니다.
 * ListExample 클래스를 실행시켰을 때 다음과 같이 출력될 수 있도록 BoardDao의 getBoardList() 메소드를
 * 작성해보세요.
*/