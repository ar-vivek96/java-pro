package core;

public class DiagonalMat {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		
		int pd=0;
		int sd=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i==j) {
					pd=pd+a[i][j];
				}
				if(i+j==a.length-1)
				{
					sd=sd+a[i][j];
				}
	
			}
		}
		System.out.println("pd :"+pd);
		System.out.println("sd :"+sd); 
		}
	}


