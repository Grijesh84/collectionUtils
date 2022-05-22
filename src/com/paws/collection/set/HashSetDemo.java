package com.paws.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//does not maintain the insertion order.
		Set<Integer> set = new HashSet<>();
		
		set.add(24);
		set.add(12);
		set.add(31);
		set.add(2);
		
		System.out.println(set);
		set.remove(12);
		
		System.out.println(set.contains(100));
		System.out.println(set.size());
		
		System.out.println(set.isEmpty());
		set.clear();
		System.out.println(set);
	}

}
