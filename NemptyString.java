package com.Ayush;

public class NemptyString{
	
	public static void main(String[] args) {
		
		String s = "abcd";
		
		for(int j=0;j<s.length();j++) {
			for(int i=j;i<=s.length();i++) {
				System.out.print(s.substring(j,i)+" ");
			}
			System.out.println();
		}
		
		
		
		
	}
}
