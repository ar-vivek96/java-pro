package core;
interface Pare1
{
	void display();
	
}
interface Pare2
{
	void show();
}
class Newclass
{
	void print()
	{
		System.out.println("in print ");
	}
}
class Myclass extends Newclass implements Pare1,Pare2
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("In Child Class");
	}

	@Override
	public void display() {
		System.out.println("in Child Class");
		
	}
	
}
public class Interface_Demo {

	public static void main(String[] args) {
		
		Myclass obj=new Myclass();
		obj.show();
		obj.display();
		obj.print();
	}

}
