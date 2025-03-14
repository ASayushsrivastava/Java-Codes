package com.Ayush;

import java.util.Map;
import java.util.HashMap;

public class Frequency{
	
	public static void function(int[] arr) {
		
//		creating an HashMap and storing the values
		Map<Integer,Integer> map = new HashMap<>();
		
//		parsing integer and storing into hash map
		for(int i : arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
//		parsing the map to print the values
		for(Map.Entry<Integer,Integer> mapping : map.entrySet()) {
			System.out.println(mapping.getKey()+" "+mapping.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {11,11,12,12,12,13,13,14};
		function(arr);
		
	}
}