package core;
@FunctionalInterface            //Lambda Expression
interface MyInterface
{
	int add(int i,int j);
}
public class Sam_Interface {

	public static void main(String[] args) {
		
		MyInterface S= (int i, int j)->
		{
			return i+j;
		};
		int res=S.add(5,6);
		System.out.println("Res "+res);
		

	}

}
