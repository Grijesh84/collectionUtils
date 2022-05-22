package com.paws.collection.list;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// data must be sorted to use this and this returns the index, O(logn)
		System.out.println(Arrays.binarySearch(arr, 3));

		int[] nums = { 4, 2, 6, 7, 4, 1, 0 };
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

		Arrays.fill(nums, 0); // Used to initialized array with given no.
		System.out.println(Arrays.toString(nums));
	}

}
