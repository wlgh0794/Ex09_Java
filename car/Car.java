package chap09_inherit.car;

public class Car {

	public String Companay;
	public String model ;
	public String color ;
	public int price ;
	
	
	
	public void carInfo()
	{
		
		System.out.println( "제조사 : " + this.Companay );		
		System.out.println( "모델 : " + this.model );		
		System.out.println( "색상 : " + this.color );		
		System.out.println( "가격 : " + this.price );
		
	}
	
	
	
//	public abstract void special() ;
//	
	
	
	
	
}
