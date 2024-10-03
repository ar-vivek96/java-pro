package core;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
	
		Map<String,Integer>m=new TreeMap();
		m.put("vivek", 90);
		m.put("Naveen", 98);
		m.put("sisin", 100);
		m.put("Arya", 96);
		m.put("Vivek",98);
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.get("vivek"));
		for(String k:m.keySet())
		{
			System.out.println(k+":"+m.get(k));
		}
		
		System.out.println(m.containsValue(90));
		System.out.println(m.size());
		System.out.println(m.remove("vivek",90));
		System.out.println(m.replace("Vivek", 98, 100));
		System.out.println(m);
		

	}

}
