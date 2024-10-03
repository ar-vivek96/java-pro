package core;
abstract class Employee
{
	 abstract public void display();
}
class Servent extends Employee
{
	public void display()
	{
		System.out.println("Abstract method ");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		
		Servent s=new Servent();
		s.display();

	}

}
