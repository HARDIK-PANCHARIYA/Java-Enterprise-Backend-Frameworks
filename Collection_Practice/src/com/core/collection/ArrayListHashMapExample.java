package com.core.collection;
import java.util.*;


public class ArrayListHashMapExample {
	public static void main(String[] args) {
		
		ArrayList<Integer> m1 = new ArrayList<>();
		m1.add(38);
		m1.add(43);
		m1.add(57);
		m1.add(82);
		
		ArrayList<Integer> m2 = new ArrayList<>();
		m2.add(82);
		m2.add(35);
		m2.add(71);
		m2.add(29);
		
		ArrayList<Integer> m3 = new ArrayList<>();
		m3.add(45);
		m3.add(37);
		m3.add(67);
		m3.add(19);
		
		HashMap<String,ArrayList<Integer>> s1=new HashMap<String, ArrayList<Integer>>();
		s1.put("A",m1);
	
		for(Map.Entry<String,ArrayList<Integer>> i : s1.entrySet()) {
			System.out.println(i.getKey()+"-"+i.getValue());
		}
		
		HashMap<String,ArrayList<Integer>> s2=new HashMap<String, ArrayList<Integer>>();
		s2.put("B",m2);
		
		for(Map.Entry<String,ArrayList<Integer>> i : s2.entrySet()) {
			System.out.println(i.getKey()+"-"+i.getValue());
		}
		
		HashMap<String,ArrayList<Integer>> s3=new HashMap<String, ArrayList<Integer>>();
		s3.put("C",m3);
		
		for(Map.Entry<String,ArrayList<Integer>> i : s3.entrySet()) {
			System.out.println(i.getKey()+"-"+i.getValue());
		}
		System.out.println("---------------------------------------------------");
		
		
		Set<String> stname = s1.keySet();
		for(String name : stname) {
			System.out.print
			(name + " - ");
			ArrayList<Integer> stud1 = s1.get(name);
			for(Integer i : stud1) {
					System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		Set<String> st2name = s2.keySet();
		for(String name : st2name) {
			System.out.print
			(name + " - ");
			ArrayList<Integer> stud1 = s2.get(name);
			for(Integer i : stud1) {
					System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
