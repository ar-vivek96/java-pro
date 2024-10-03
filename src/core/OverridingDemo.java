package core;
class parent2
{
	public void show()
	{
		System.out.println("in Parent");
	}
	
}
class Childd extends parent2
{
	public void show()
	{
		System.out.println("in Child");
	}
	
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		Childd c=new Childd();
		c.show();
		
	
		
		

	}

}
