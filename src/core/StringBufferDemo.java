package core;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Hello");
		StringBuffer s1=new StringBuffer("Hello World");
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(2));
		System.out.println(sb.append(" World"));
		System.out.println(sb.compareTo(s1));
		System.out.println(sb.indexOf("H"));
		System.out.println(sb.substring(2,4));
		System.out.println(sb.insert(0, "Hi "));
		System.out.println(sb.delete(0, 2));
		System.out.println(sb.subSequence(0, 3));
		System.out.println(sb.replace(0, 3, "Ce"));

		sb.setCharAt(0, 'j');
		System.out.println(sb);
		
	}

}
