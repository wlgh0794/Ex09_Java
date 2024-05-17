package chap09_inherit.animal;

public class Bird extends Animal {

	
	// 1 . 메소드 오버라이드
	
	// 부모클래스의 정의되어 있는 메소드를 재정의
	
	// 항상 부모클래스에 정의되어 있는 메소드의 형태( 리턴타입 , 메소드명 , 매개변수의 타입 , 개수 , 순서) 와
	// 동일하게 정의한다.
	
	
	@Override
	public void eat() 
	{
		System.out.println( "Bird - 모이를 쪼아 먹는다." );
	}
	
	@Override
	public void sleep() 
	{
		System.out.println( "Bird - 잠을 나뭇가지에 앉아서 잔다." );
	}
	
}
