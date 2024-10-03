package core;
class Parentt
{
	int a=10;
	void display()
	{
		System.out.println("In Parent");
	}
}
class Chilld extends Parentt
{
	int a=20;
	void display()
	{
		super.display();
		System.out.println("In Child Class");
		System.out.println("a:"+super.a);
		System.out.println("a: "+a);
	}
}
public class SuperDemo {

	public static void main(String[] args) {

		
		Chilld c=new Chilld();
		c.display();

	}

}
