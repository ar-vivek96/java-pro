package core;
class GrandFather        //super,base,parent class
{
	int c;
	public void print()
	{
		System.out.println("in GrandFather");
	}
}
class Parent extends GrandFather	  //sub class,derived class,child class
{
	int a;
	public void show()
	{
		System.out.println("in Parent ");
	}
	
}
class Child extends Parent
{
	int b;
	public void display()
	{
		System.out.println("in Child");
	}
	
}


public class InheritanceDemo {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.show();
		c.display();
		c.a=20;
		c.b=30;
		System.out.println(c.a);
		c.print();

	}

}