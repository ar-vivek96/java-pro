package core;

class Encap
{
	private int age=22;

	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		
		Encap E=new Encap();
		E.setAge(50);
		System.out.println(E.getAge());
		
		
		
	}

}
