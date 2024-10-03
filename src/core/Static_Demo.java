package core;
class Student
{
	String Name;
	int age;
	 static String Teacher;
	
	
	void display()
	{
		System.out.println("Name: "+Name);
		System.out.println("Age : "+age);
		System.out.println("Teacher: "+Teacher);
	}
	static {
	 Student.Teacher= "xavier";
	}
	
}
public class Static_Demo {

	public static void main(String[] args) {

		Student s1=new Student();
		Student s2=new Student();
		s1.Name="Vivek";
		s1.age=26;
		
		s1.display();
		s2.Name="Raj";
		s2.age=28;		
		s2.display();
		

	}

}
