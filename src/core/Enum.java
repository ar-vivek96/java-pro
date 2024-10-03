package core;
enum Shape
{
	CIRCLE,TRIANGLE,SQUARE;
}
public class Enum {

	public static void main(String[] args) {
		
		Shape a=Shape.TRIANGLE;
	/*	System.out.println(a.ordinal());
		System.out.println(Shape.CIRCLE);
		Shape[] obj=Shape.values();
		for(Shape b:obj)
		{
			System.out.println(b.ordinal());
		}
		if(a==Shape.CIRCLE)
		{
			System.out.println("No Sides");
		}
		else if(a==Shape.TRIANGLE)
		{
			System.out.println("Three Sides");
		}
		else if(a==Shape.SQUARE)
		{
			System.out.println(" Four Sides");
		}
		else
		{
			System.out.println(" Something Wrong");
		}
		
*/		System.out.println(a.getClass().getSuperclass());
	}

}
