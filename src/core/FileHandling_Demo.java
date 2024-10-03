package core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileHandling_Demo {

	public static void main(String[] args) throws IOException {

		File f=new File("Demofile.txt");
		
		/*if(f.createNewFile())
		{
			System.out.println("File Created"+f.getName());
		}
		else
		{
			System.out.println("Already there"+f.getName());
		}
		String ip[]= { "Hi","Hello","welcome"};
		FileOutputStream fis=new FileOutputStream(f);
		DataOutputStream dos=new DataOutputStream(fis);
		for(String a:ip)
		{
			dos.writeUTF(a);
		}
		
		dos.writeUTF("bye");
		FileInputStream fos=new FileInputStream(f);
		DataInputStream dis=new DataInputStream(fos);
		while(dis.available()>0) {
		String str=dis.readUTF();
		System.out.println(str);}
		*/
		if(f.exists())
		{
			System.out.println(f.getName());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.getPath());
			System.out.println(f.length());
		}
		else
		{
			System.out.println("file not exists");
		}
		
		
		
		

	}

}
