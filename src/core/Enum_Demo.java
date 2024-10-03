package core;
enum Shape1
{
	CIRCLE,SQUARE(4),TRIANGLE;
	
	private int side;
	private Shape1()
	{
		System.out.println("Constructor");
	}
	private Shape1(int i)
	{
		side=i;
	}
	public int getSides()
	{
		return side;
	}
	
	
	
	
}

public class Enum_Demo {

	public static void main(String[] args) {
		
		Shape1 obj=Shape1.SQUARE;
		System.out.println(obj.CIRCLE);
		System.out.println(obj.getSides());

	}

}
