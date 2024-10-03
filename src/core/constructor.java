package core;
class Demo
{
	int num1;
	int num2;
	int result;
	Demo(int a,int b)
	{
		num1=a;
		num2=b;
	}
	Demo()
	{
		System.out.println("Hello");
	}
	void display()
	{
		result =num1+num2;
		System.out.println("result: "+result);
	}
}
public class constructor {

	public static void main(String[] args) {
		
		Demo  d=new Demo();
		Demo d1=new Demo(10,20);
		d1.display();

		
		

	}
	

}
