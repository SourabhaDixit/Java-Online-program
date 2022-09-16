package javabasicsconcepts;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
	 
		String str= "sourabha";  
		char charArray[] = str.toCharArray();
		Arrays.sort(charArray);
		System.out.print(Arrays.toString(charArray)); 
	}

}
