package chap09_inherit.animal;

public class Tiger extends Animal
{

	String skin;
	
	public Tiger()
	{
		
	}
	
	public Tiger( int age , String size , boolean hasWing )
	{
		// [ super ]
		// 자식 클래스에서 부모 클래스를 호출할 수 있는  super 키워드
		
		// super ( age , size , hasWing ) == Animal( age , size hasWing )
		super(  age , size , hasWing ) ;
		
		this.age = age ;
		this.size = size ;
		this.hasWing = hasWing ;
		
	}
	
	
	// [@override] : 컴파일러가 자식 클래스와 부모클래스를 비교하면서
	// 해당메소드가 오버라이드 됐는지를 비교한다 .
	// [@override]를 사용하면 컴파일러에게 미리 이 메소드가 오버라이드된 메소드라는 것을 알린다 .
	
	@Override
	public void eat()
	{
		// 인스터스 메소드에서도 super 키워드를 사용할 수 있다 .
		// 부모크래스에 정의되어 있는 eat() 메소드 실행
		super.eat(); // 부모클래스의 함수를 실행할려면 super를 이용한다.
		
		System.out.println( "Tiger - 육식을 한다."  );
		
	}
	
	
	@Override
	public void sleep() 
	{
		super.sleep();
		
		System.out.println( "Tiger- 누워서 잔다. " );
	}
	
}
