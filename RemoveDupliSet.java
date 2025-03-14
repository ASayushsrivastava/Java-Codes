package com.Ayush;

import java.util.HashSet;

public class RemoveDupliSet{
	
	public static void function (int[] arr) {
		
		HashSet<Integer> set = new HashSet<>();
		for(int i:arr) {
			set.add(i);
		}
		
		set.forEach(val -> System.out.println(val+" "));
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {11,12,12,11,13,13,14,14,15};
		function(arr);
		
	}
}