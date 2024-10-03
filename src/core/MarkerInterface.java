package core;

import java.io.*;
class Save implements Serializable
{
	int i;
}

public class MarkerInterface {

	public static void main(String[] args) throws Exception {
		
		Save obj=new Save();
		int a=obj.i=10;
		System.out.println(a);
		File f=new File("MY FILE.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream obs =new ObjectOutputStream(fos);
		obs.writeObject(obj);
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Save obj1=(Save) ois.readObject();
		System.out.println(obj1.i);
	
	
		
		

	}

}
