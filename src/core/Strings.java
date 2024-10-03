package core;

public class Strings {

	public static void main(String[] args) {

		 String	s="Hello,world,hi";
		 String s1="hello";
		 System.out.println(s.length());
		 System.out.println(s.charAt(0));
		 System.out.println(s.indexOf('H'));
		 System.out.println(s.compareTo(s1));
		 System.out.println(s.toUpperCase());
		 System.out.println(s.toLowerCase());
		 System.out.println(s.concat(s1));
		 System.out.println(s.contentEquals(s1));
		 System.out.println(s.equals(s1));
		 System.out.println(s.trim());
		 System.out.println(s.replace('H', 'C'));
		 System.out.println(s.substring(0,5));
		 System.out.println(s.contains("llo"));
		 System.out.println(s.equalsIgnoreCase(s1));
		 System.out.println(s.lastIndexOf('l'));
		 String[] a=s.split(",");
		 for(String A:a)
		 {
			 System.out.println(A);
		 }
		 
		 System.out.println(s.toCharArray());
		 String str="abcd";
		 char x[]=str.toCharArray();
		 for(char c:x)
		 {
			 System.out.println(c);
		 }
		 
		 String sr=String.valueOf(x);
		 System.out.println(sr);
		 

	}

}
