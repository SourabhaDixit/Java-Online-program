package javabasicsconcepts;

public class ReverseString {

	public static void main(String[] args) {
		String str ="Sourabha";
		
		System.out.println("Original String:"+str);
		for(int i=str.length();i>0;i--) {
			char ch = str.charAt(i-1);
			System.out.print(""+ch);
		}
	}

}
