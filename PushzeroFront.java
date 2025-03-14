package com.Ayush;
import java.util.LinkedHashSet;
public class PushzeroFront {

	public static void remove(int[] a)
    {
        LinkedHashSet<Integer> s
            = new LinkedHashSet<Integer>();

        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            s.add(a[i]);

        System.out.print(s);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int arr[] = {1,0,2,0,3,0,4,0};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		remove(arr);
		
	}

}
