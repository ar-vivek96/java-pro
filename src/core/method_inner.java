package core;
class outer1
{
	public void getAccess()
	{
	class inner
	{
		public void show()
		{
			System.out.println("Method inner class");
		}
	}
		inner in=new inner();
		in.show();
	}
}
public class method_inner {

	public static void main(String[] args) {
		
		outer1 out=new outer1();
		out.getAccess();
	

	}

}
