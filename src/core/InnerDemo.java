package core;
class Outer
{
	static class Inner
	{
		public void show()
		{
			System.out.println("inner Class");
		}
	}
}

public class InnerDemo {

	public static void main(String[] args) {
		
		Outer out=new Outer();
		Outer.Inner obj=new Outer.Inner();
		obj.show();

	}

}
