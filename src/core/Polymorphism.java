package core;

class Overload
{
	int n1;
	int n2;
	int res;
	void sum(int a,int b)
	{
		n1=a;
		n2=b;
		res=a+b;
		System.out.println("RES: "+res);
	}
	void sum(double a,double b)
	{
		n1=(int)a;
		n2=(int)b;
		res=(int) ((double)a+(double)b);
		System.out.println("RES: "+res);
	}
	void sum(double a,int b)
	{
		n1=(int)a;
		n2=b;
		res=(int)a+b;
		System.out.println("RES :"+res);
	}
	
}
public class Polymorphism {

	public static void main(String[] args) {
		
		Overload obj=new Overload();
		obj.sum(20, 10);
		obj.sum(20.5, 30.5);
		obj.sum(10.5, 10);
	}

}
