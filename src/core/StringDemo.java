package core;

public class StringDemo {

	public static void main(String[] args) {

		String s=new String ("Vivek");
		System.out.println(s);
		String st="vi";
		System.out.println(st);
		st="abc";
		System.out.println(st.hashCode());
		String st1="abc";
		System.out.println(st1);
		System.out.println(st1.hashCode());

	}

}
