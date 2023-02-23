package org.CollectionsPrograms;

public class LastWordLength3 {
public static void main(String[] args) {
	String s = "luffy is still joyboy";
String[] split = s.split(" ", 4);	

for (int i = 3; i < split.length; i++) {
	String lastWord = split[i];
	int length = lastWord.length();
	System.out.println("The last word is "+lastWord+ "  with length "+ length);
		
}
	
}
}
