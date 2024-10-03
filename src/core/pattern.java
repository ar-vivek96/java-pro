package core;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row 1");
		int row1 =sc.nextInt();
		System.out.println("Enter Col1");
		int col1=sc.nextInt();
		
		
/*		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	*/
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				if(i==0||i==row1-1||j==0||j==col1-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
