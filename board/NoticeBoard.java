package chap09_inherit.board;

public class NoticeBoard extends FreeBoard {

	boolean isAdmin = false ;

	public NoticeBoard(long id, String title, String content, String writer, String creDate, boolean isadmin) {
		
		super(id, title, content, writer, creDate, creDate);
	}


	@Override
	public void post()
	{
		if( this.isAdmin )
		{
			System.out.println( "관리자가 공지사항을 등록합니다." );
		}
		else
		{
			System.out.println( "공지 사항은 관리자만 등록" );
		}
		
		
	}
	
	
	
}
