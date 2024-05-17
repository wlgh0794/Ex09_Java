package chap09_inherit.car;

public class HyundaiCar {

	public String Comapnay;
	public String model ;
	public String color ;
	public int price ;
	
	
	
	public void carInfo()
	{
		
		System.out.println( "제조사 : " + this.Comapnay );		
		System.out.println(  "모델 : " + this.model );		
		System.out.println( " 색상 : " + this.color );		
		System.out.println( "가격 : " + this.price );
		
	}
	
	
	public void autoPilot()
	{
		
		System.out.println( "자율 주행한다." );
		
	}
	
}
