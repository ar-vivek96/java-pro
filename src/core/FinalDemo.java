package core;
class X
{
	void show()
	{
		System.out.println("Parent");
	}
}
class y  extends X
{
	void show()
	{
		System.out.println("Child");
		
	}
	
}
public class FinalDemo {

	public static void main(String[] args) {

		y obj=new y();
		obj.show();
		

	}

}
