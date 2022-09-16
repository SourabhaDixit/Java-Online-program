package javabasicsconcepts;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] x = {1,20,3,4,60,6,10,7,54,89,23};
	
		System.out.println("Original elements:");
		 for (int i = 0; i < x.length; i++) {     
	            System.out.print(x[i]+" ");
		 }
	     Arrays.sort(x);    
	        System.out.println("\nElements of array sorted in ascending order: ");    
	        for (int i = 0; i < x.length; i++)     
	            System.out.print(x[i] + " ");   
		

	}


}
