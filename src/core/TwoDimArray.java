package core;

import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Row:");
		int row=sc.nextInt();
		System.out.println("Enter Col:");
		int col=sc.nextInt();
		int a[][]= new int[row][col];
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter Elements a["+i+"]"+"["+j+"]");
				a[i][j]=sc.nextInt();
			}
		}
	/*	for(int b[]: a)
		{
					for(int c:b)
				{
					System.out.print(" "+c);
				}
					System.out.println(" ");
		}
	*/
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println(" ");
		}
	}

}
