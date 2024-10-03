package core;

public class ArrayDemo {

	public static void main(String[] args) {
	//	int b[]= {10,10,20,30,40,50};
		String b[]= {"Vivek","Anbu","Rani"};
		int a[]=new int[5];
		a[0]=3;
		a[1]=5;
		a[2]=10;
		a[3]=25;
		a[4]=30;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println("\n");
		for(String x:b)
		{
			
			System.out.print(" "+x);
		}

	}

}
