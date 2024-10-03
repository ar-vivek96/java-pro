package core;

public class Exception_D {

	public void Throw()throws Exception
	{
		String str =null;
		System.out.println(str.length());	
	}
	 public void slave()
	 {
		 try {
		 Throw();
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception"+e);
		 }
	 }
	
	
	public static void main(String[] args) {
		
		Exception_D obj =new Exception_D();
		
		obj.slave();
	}

}
