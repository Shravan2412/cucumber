package org.string.practice;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example {

	public static void main(String[] args) {
		Map<Integer, String> s=new Hashtable<Integer, String>();
		s.put(10, "shravan");
		s.put(20,"senthil");
		s.put(10, "elamukil");
		s.put(50, "Arumugam");
		s.put(40, "shravan");
		s.put(50, "shravan");
		System.out.println(s);
		Set<Integer> a=s.keySet();
		System.out.println(a);
			Collection<String> b=s.values();
			System.out.println(b);
			Set<java.util.Map.Entry<Integer, String>> c=s.entrySet();
			for(java.util.Map.Entry<Integer, String> x:c) {
				System.out.println(x.getKey());
				System.out.println(x.getValue());
			}
		}
		
		
	}
	

