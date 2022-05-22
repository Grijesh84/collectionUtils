package com.paws.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// Implements the Binary Search Tree(BST) and set property.
		Set<Integer> set = new TreeSet<>();

		set.add(24);
		set.add(12);
		set.add(31);
		set.add(2);
		set.add(12);

		System.out.println(set);
		set.remove(12);

		System.out.println(set.contains(100));
		System.out.println(set.size());

		System.out.println(set.isEmpty());
		set.clear();
		System.out.println(set);
	}

}
