package com.core.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("A",20);
		hm.put("B", 40);
		hm.put("C", 60);
		
		System.out.println(hm);
		System.out.println("------------------------------------------------");
		
		for(Map.Entry<String, Integer> i : hm.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue());
		}
		
	}

}
