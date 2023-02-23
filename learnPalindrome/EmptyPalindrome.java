package org.learnPalindrome;

public class EmptyPalindrome {
public static void main(String[] args) {
	String s="sas";
	char[] charArray = s.toCharArray();
	String support="";
	for (int i = charArray.length-1; i >=0; i--) {
		support=support+charArray[i];
	}
	//System.out.println(support);
	if(s.equals(support)) {
		System.out.println(s+ " is a palindrome");
	}else {
		System.out.println(s+ " is not a palindrome");
	}
}
}
