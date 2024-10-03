package core;
class Outer1
{
  protected int age=20;
	
	/* private class Inner
	{
		public void show()
		{
			System.out.println("In show");
		}
		
		
	}
	 public void method()
		{
			Inner in=new Inner();
			in.show();
		}
	*/
	
}
public class Acessmodifier {

	public static void main(String[] args) {

		Outer1 obj=new Outer1();
	//	obj.method();
		System.out.println(obj.age);
		
		
	

	}

}
