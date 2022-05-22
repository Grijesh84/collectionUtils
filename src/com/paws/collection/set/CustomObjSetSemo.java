package com.paws.collection.set;

import java.util.HashSet;
import java.util.Set;

import com.paws.collection.list.Student;

public class CustomObjSetSemo {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();

		set.add(new Student(11, "Pawan"));
		set.add(new Student(9, "Pranshu"));
		set.add(new Student(11, "Pawan"));
		
		System.out.println(set);
	}

}
