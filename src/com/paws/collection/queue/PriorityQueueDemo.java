package com.paws.collection.queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		//Default it implements min heap property.
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(90);
		pq.add(50);
		pq.add(25);
		pq.add(100);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		
		pq.poll();
		System.out.println(pq);
		
		//to achive max heap property, in constructor we can pass Comparator. 
		//PriorityQueue<Integer> pqMax = new PriorityQueue<Integer>(Comparator.reverseOrder());
		PriorityQueue<Integer> pqMax = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		pqMax.add(90);
		pqMax.add(50);
		pqMax.add(25);
		pqMax.add(100);
		
		System.out.println(pqMax);
		System.out.println(pqMax.peek());
		
		pqMax.poll();
		System.out.println(pqMax);
		
		
		

	}

}
