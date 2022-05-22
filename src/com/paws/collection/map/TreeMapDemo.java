package com.paws.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		//Orders on the key 
		Map<String, Integer> map = new TreeMap<>();

		map.put("One", 1);
		map.put("Two", 2);
		map.put("Thress", 3);
		map.put("Four", 4);

		System.out.println(map);

		map.putIfAbsent("Two", 23);
		map.putIfAbsent("Five", 5);
		System.out.println(map);

		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("Two"));
		System.out.println(map.containsValue(15));

		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

		for (String key : map.keySet()) {
			System.out.println(key);
		}

		for (Integer i : map.values()) {
			System.out.println(i);
		}

		map.remove("Five");
		System.out.println(map);
		
		map.clear();
		System.out.println(map);

	}

}
