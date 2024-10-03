package core;
abstract class Test1
{
	public abstract void show();
	
}

public class AbstractAnonnymous {

	public static void main(String[] args) {

		Test1 t=new Test1() 
		{
			public void show()
			{
				System.out.println("Abstract annonymous");
			}
		};
		t.show(); 

	}

}
