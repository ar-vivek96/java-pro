package core;
class Addition
{
	int sum=0;
	public int add(int...a )
	{
		for(int val:a)
		{
			sum=sum+val;
		}
		return sum;
		
	}
}
public class VarargsDemo {

	public static void main(String[] args) {
	
		Addition a=new Addition();
		int res=a.add(10,20,30,40);
		System.out.println(res);

	}

}
