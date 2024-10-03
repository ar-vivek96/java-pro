package core;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int max,i;
		int a[]=new int[5];
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter Element a"+"["+i+"]:");
			a[i]=sc.nextInt();
		}
		max=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("MAximum element:"+max);
		

	}

}
