package com.Ayush;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class InputwithoutSize {

	public static void function(Scanner in) {
		
//		creating arrayList to store the user input
		List<Integer> arr = new ArrayList<>();
		
//		taking input until there is
		while(in.hasNextInt()) {
			arr.add(in.nextInt());
		}
		
//		printing the results
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		function(in);
	}

}
