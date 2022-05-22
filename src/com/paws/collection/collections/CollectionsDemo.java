package com.paws.collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(14);
		list.add(7);
		list.add(13);
		list.add(9);
		list.add(25);
		
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		
		System.out.println(Collections.frequency(list, 13));
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}
