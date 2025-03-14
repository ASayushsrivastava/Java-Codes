package com.Ayush;

import java.util.Arrays;

public class LElementArr{
	
	static int function(int[] arr, int k) {
				
		Arrays.sort(arr);

//		int max=0;
//		for(int i=0;i<k;i++) {
//			max=arr[arr.length-1];
//			arr = Arrays.copyOf(arr, arr.length-1);
//		}
//		return max;
		
		return arr[arr.length-k];
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {3,2,3,1,2,4,5,5,6};
		int k = 4;
		
		System.out.println(function(arr,k));;
		
	}
}