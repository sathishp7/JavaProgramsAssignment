package org.javaPrograms;

public class SqaureRootPrograms {
public static void main(String[] args) {
	int x=64;
	int count=0;
	for (int i = 0; i <=x; i++) {
		if(i*i==x) {
			count=i;
		}
	}
	System.out.println("The square root is 64: "+count);
}
}
