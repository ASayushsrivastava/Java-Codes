package com.Ayush;
import java.util.*;

public class RemoveDupli{
	
	public static void main(String[] args) {
		int[] arr= {1,1,2,3,4,4,5,6,6};
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i:arr) {
			map.put(i,map.getOrDefault(i,0)+1);
		}
		
		for(Map.Entry<Integer, Integer> mapping : map.entrySet()) {
			System.out.print(mapping.getKey()+" ");
		}
		
	}
}