package com.Ayush;

public class PushzeroLast{
	
	public static void function(int[] arr) {
		int count =arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count--;
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,2,0,3,0,4,5,0};
		function(arr);
	}
}