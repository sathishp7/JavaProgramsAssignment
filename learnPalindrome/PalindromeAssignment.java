package org.learnPalindrome;

import org.apache.poi.util.SystemOutLogger;

public class PalindromeAssignment {
public static void main(String[] args) {
	String s="A man, a plan, a canal: Panama";
	String support="";
	String convertLowerCase = s.toLowerCase();
	String combineSpace = convertLowerCase.replace(" ", "");
	String replacedSymbols = combineSpace.replaceAll("\\W", "");
	
	char[] charArray = replacedSymbols.toCharArray();
		
	for (int i = charArray.length-1; i >=0; i--) {
		support=support+charArray[i];
	}
	
	
if(replacedSymbols.equals(support)) {
	System.out.println(support+" is a Palindrome");
}else {
	System.out.println(support+ " is not a Palindome");
}
	
}
}
