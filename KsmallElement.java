package com.Ayush;
import java.util.Scanner;
import java.util.Collections;
import java.util.PriorityQueue;

public class KsmallElement {
	
	static int function(int arr[], int k) {
		PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
		for(int i: arr) {
			maxheap.offer(i);
			if(maxheap.size()>k) {
				maxheap.poll();
			}
		}
		return maxheap.peek();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int n = in.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+" element: ");
			arr[i] = in.nextInt();
		}
		
		System.out.println("Enter kth number: ");
		int k = in.nextInt();
		in.close();
		
//		int arr[] = new int[] {7,10,4,3,20,15};
//		int k=3;
		
		System.out.println(function(arr,k));
		
		
	}
}
