package com.paws.collection.list;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<Integer>();
		
		adq.offer(22);
		adq.offerFirst(12);
		adq.offerLast(42);
		adq.offer(26);
		
		System.out.println(adq);
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		adq.poll();
		System.out.println(adq);
		adq.pollFirst();
		System.out.println(adq);
		adq.pollLast();
		System.out.println(adq);
	}

}
