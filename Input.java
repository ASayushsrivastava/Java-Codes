package com.Ayush;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Input{
	
	public static void main(String[] args) {
//		declaring scanner instance
		Scanner in = new Scanner(System.in);
		
//		taking user input for next line
//		storing it in a String variable
		String line = in.nextLine();
		in.close();
		
//		creating tokens and storing into an array
		String[] tokens = line.split("\\s+");
		
//		creating array list to store the tokens as parsed integer
		List<Integer> arr = new ArrayList<>();
		
//		parsing the tokens into integer and storing into array list
		for(String token : tokens) {
			arr.add(Integer.parseInt(token));
		}
		
//		printing array values
		for(int val: arr) {
			System.out.print(val+" ");
		}
		
		arr.toArray();
		for(int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println(arr.size());
		
	}
}