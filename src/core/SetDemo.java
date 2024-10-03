package core;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> s=new TreeSet<>();
		s.add(10);
		s.add(40);
		s.add(30);
		s.add(90);
		s.add(40);
		System.out.println(s.getClass());
		System.out.println(s);
		Iterator it=s.iterator();
		while(it.hasNext())
		System.out.println(it.next());
		

	}

}
