package org.learnPalindrome;

public class PalindromeAssigment2 {
	public static void main(String[] args) {
		String s = "race a car";
		String support= "";
		String replaced = s.replace(" ", "");
		char[] charArray = replaced.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			support= support+charArray[i];
			
		}
		if(s.equals(support)) {
			System.out.println(support+ " is a palindrome");
		}else {
			System.out.println(support+ " is not a palindrome");
		}
	}
}
