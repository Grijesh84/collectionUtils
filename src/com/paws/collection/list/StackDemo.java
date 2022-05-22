package com.paws.collection.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();
		
		animals.push("Lion");
		animals.push("Hourse");
		animals.push("Dog");
		animals.push("Cat");
		
		System.out.println("Stack " + animals);
		
		System.out.println("Peek: " + animals.peek());
		
		animals.pop();
		System.out.println("Animal: " + animals);
		System.out.println("After 1 pop peek: " + animals.peek()) ;
		
		
		
		
	}

}
