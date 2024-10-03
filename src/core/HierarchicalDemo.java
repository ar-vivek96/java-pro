package core;

class Parent1
{
	public void display()
	{
		System.out.println("In Parent");
	}
}
class Child1  extends Parent1
{
	public void show1()
	{
		System.out.println("In Child1");
	}
}
class Child2 extends Parent1
{
	public void show2()
	{
		System.out.println("In Child2");
	}
}


public class HierarchicalDemo {

	public static void main(String[] args) {

		Child1 c1=new Child1();
		Child2 c2=new Child2();
		
		c1.display();
		c1.show1();
		c2.display();
		c2.show2();

	}

}
