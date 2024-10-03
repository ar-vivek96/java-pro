package core;

import java.util.*;
import java.util.Collection;

public class Collection_Frame {

	public static void main(String[] args) {
		
		ArrayList<Integer> c=new ArrayList<Integer>();
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(50);
		c.add(1,20);
		Collections.sort(c);
		System.out.println(c);
		System.out.println(c.get(0));
		c.set(0, 10);
		System.out.println(c);
		
		System.out.println(c);
		c.remove(c.indexOf(20));
		System.out.println(c);
		Iterator it=c.iterator();
		while(it.hasNext())
		System.out.print(it.next()+" ");
		
	}

}
