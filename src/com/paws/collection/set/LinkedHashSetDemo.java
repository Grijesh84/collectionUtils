package com.paws.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// Maintain the insertion order.
		Set<Integer> set = new LinkedHashSet<>();

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
