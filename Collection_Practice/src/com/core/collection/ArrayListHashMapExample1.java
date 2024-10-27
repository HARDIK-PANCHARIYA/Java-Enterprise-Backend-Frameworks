package com.core.collection;
import java.util.*;

public class ArrayListHashMapExample1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> mhc = new ArrayList<>();
		mhc.add("Pune");
		mhc.add("Mumbai");
		mhc.add("Nagpur");
		
		ArrayList<String> gjc = new ArrayList<>();
		gjc.add("Rajkot");
		gjc.add("Surat");
		gjc.add("Ahamadabad");
		
		ArrayList<String> kntc = new ArrayList<>();
		kntc.add("Bangalore");
		kntc.add("Hubli");
		kntc.add("Mysore");
		
		HashMap<String,ArrayList<String>> state = new HashMap<String, ArrayList<String>>();
		state.put("MH", mhc);
		state.put("GJ", gjc);
		state.put("KNT", kntc);
		
		Set<String> sname = state.keySet();
		for(String staten : sname) {
			System.out.print(staten+" - ");
			ArrayList<String> city = state.get(staten);
			for(String i : city) {
				System.out.print(i+", ");
			}
			System.out.println();
		}
		
		
	}

}
