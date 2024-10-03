package core;

public class TransposeMat {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,},
					{4,5}};
		int b[][]=new int[a[0].length][a.length];
		
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				b[i][j]=a[j][i];
			}
		
		}
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}

	}

}
