package chap09_inherit;

import chap09_inherit.board.FreeBoard;
import chap09_inherit.board.NoticeBoard;

public class _03_Board {

	public static void main(String[] args) 
	{
		
		FreeBoard board = new FreeBoard( 1 , "안녕하세요 " , "자바어려워요" , "고기천" , "2024-05-02" , "첨부파일" );
		
		board.post();
		
		board = new NoticeBoard( 1 , "안녕하세요 " , "공지사항 " , "관리자"  , "2024-05-02" , false ) ;
	
	
		board.post(); 

	}

}
