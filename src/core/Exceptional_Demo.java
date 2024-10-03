package core;

public class Exceptional_Demo {

	public static void main(String[] args) {
		try {
			int b=5/1;
			try {
				int a[]=new int[2];
				a[3]=3;
			}
			catch(Exception e)
			{
				System.out.println("Exception"+e);
			}
		
		}
		catch(Exception e)
		{
			System.out.println("Exception-->"+e);
		}
		finally
		{
			System.out.println("bye");
		}
		

	}

}
