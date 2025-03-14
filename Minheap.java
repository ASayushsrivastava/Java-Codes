package com.Ayush;
import java.util.PriorityQueue;

public class Minheap{
	
	static int function(int arr[], int k) {
		PriorityQueue<Integer> minheap = new PriorityQueue<>();
		for(int i:arr) {
			minheap.add(i);
			if(minheap.size()>k) {
				minheap.remove();
			}	
		}
		return minheap.peek();
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {3,2,3,1,2,4,5,5,6};
		int k = 4;
		System.out.println(function(arr,k));
		
		
	}
	
}