package core;
interface inter
{
	int age=20;
	void show();
	void display();
	
}
class Abc implements inter
{

	@Override
	public void show() {
		System.out.println("in show");
		
	}

	@Override
	public void display() {
		
		System.out.println("in diplay");
		
	}
	
}

public class Interface {

	public static void main(String[] args) {
		
		
		Abc obj=new Abc();
				obj.show();
				obj.display();
				System.out.println(Abc.age);
	}

}
