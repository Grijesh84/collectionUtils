package com.paws.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// Initial length start with 10 and then when it will be going to full it grows
		// by (n/2+1) ex 10, 10+6=16, 10 + (16/2)+1 = 27.
		// Then it copies the old list into new and dumps the old one.
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);

		list.add(4);
		System.out.println(list);

		list.add(1, 50); // This will add 50 at index 1.
		System.out.println(list);

		
		for(int i = 0;i<list.size();i++) {
			System.out.println("loop: " + list.get(i));
		}
		
		for(Integer i : list) {
			System.out.println("For each: " + i);
		}
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println("Iterator: " + it.next());
		}
		
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(100);
		list2.add(101);

		list.addAll(list2); // This will copy/add list2 into list at the end.
		System.out.println(list);

		list.set(1, 1000); // To reset the new value 1000 on index 1.
		System.out.println(list);

		list.remove(1);
		System.out.println(list); // This will remove index 1 data.

		list.remove(Integer.valueOf(100));
		System.out.println(list); // This will Remove the all value 100 from the list.

		list.clear(); // clears the list.
		System.out.println(list);
		
		for(int i = 0;i<list.size();i++) {
			System.out.println("loop: " + list.get(i));
		}

	}

}
