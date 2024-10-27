package com.core.collection;

import java.util.ArrayList;

public class ArrayListProgram {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);
		System.out.println("------------------------------------------------------");
		
		for(Integer i:al) {
			System.out.println(i);
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Hardik");
		al2.add("Vedant");
		al2.add("Ram");
		
		System.out.println(al2);
		System.out.println("------------------------------------------------------");
		
		for(String i: al2) {
			System.out.println(i);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		
	}

}
