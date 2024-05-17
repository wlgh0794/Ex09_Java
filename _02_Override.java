package chap09_inherit;

import chap09_inherit.animal.Animal;
import chap09_inherit.animal.Bird;
import chap09_inherit.animal.Tiger;

public class _02_Override {
	
	public static void main( String [] args )
	{
		// [부모 클래스 ] && [ 자식 생성자 ] : 상속 관계
		
		Animal animal = new Bird();
		
		// Bird 크래스의 eat , sleep  실행
		
		animal.eat();
		animal.sleep();
		
		animal = new Tiger() ;
		
		// Tiger 클래스의 eat , sleep 실행
		animal.eat();
		animal.sleep();
		
	}

}
