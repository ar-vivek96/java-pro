package core;

public class enhanced_demo {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
	/*	for(int x:a)
		{
			System.out.print(" "+x);
		}*/
		int b[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		
		for(int c[]:b)
		{
			for(int d:c)
			{
				System.out.print(" "+d);
			}
			System.out.println();
		}

	}

}
