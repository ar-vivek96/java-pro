package core;

class Welcome
{
	public void Greet(String a,int b)
	{
		System.out.println("WelCome"+a+" "+b);
	}
	int add(int a,int b)
	{
		return a+b;
	}
}
public class Methods_Demo {

	public static void main(String[] args) {
		
		Welcome w=new Welcome();
		w.Greet(" Vivek",27);
		System.out.println(w.add(10, 10));
		
	}

}
