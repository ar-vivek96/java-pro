package core;
class Test
{
	public void display()
	{
		System.out.println("in test");
	}
}


public class AnonymousInnerclass_demo {

	public static void main(String[] args) {
			
		Test t=new Test() {
			public void display()
			{
				System.out.println("in new  test");
			}
			
		};
		t.display();

	}

}
