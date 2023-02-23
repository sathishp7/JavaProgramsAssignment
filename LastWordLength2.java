package org.CollectionsPrograms;

public class LastWordLength2 {
public static void main(String[] args) {
	String s= "   fly me   to   the moon  ";
	String replaced = s.replace(" ", ""); 
	
	System.out.println("Total length of the string "+replaced.length());
	String lastWord = replaced.substring(10);
	int length = lastWord.length();
	System.out.println("The last word is "+lastWord+ "  with length " +length);


	
}
}
