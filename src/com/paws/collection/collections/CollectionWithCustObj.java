package com.paws.collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.paws.collection.list.Student;

public class CollectionWithCustObj {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();

		list.add(new Student(11, "Pawan"));
		list.add(new Student(9, "Amit"));

		list.add(new Student(8, "Rupa"));
		list.add(new Student(12, "Pawan"));

		System.out.println(list);
		Collections.sort(list); // Needs student class to implement Comprable<Student> interface.
		System.out.println(list);
		
		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		
		System.out.println(list);
	}

}
