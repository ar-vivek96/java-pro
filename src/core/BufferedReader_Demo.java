package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader_Demo {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter msg ");
		int s=Integer.parseInt(br.readLine());
		System.out.println("Your Msg "+(s+10) );
		
		
		
		
		

	}

}
