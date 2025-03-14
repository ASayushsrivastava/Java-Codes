package com.Ayush;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class InputmostUsed{
	
	public static void function(Scanner in) {
//		when not size not data type is given
//		store the data into a string datatype
		String line = in.nextLine();
		
//		create tokens and storing into an array
		String[] tokens = line.split("\\s+");
		
//		creating array List for storing array
		List<Integer> arr = new ArrayList<>();
		
//		parsing through tokens and storing into array list
		try {
			for(String token : tokens) {
				arr.add(Integer.parseInt(token));
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
//		printing out the array list
		for(int val : arr) {
			System.out.println(val);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		function(in);
		
	}
}