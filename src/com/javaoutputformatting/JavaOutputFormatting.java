package com.javaoutputformatting;
import java.util.*;

public class JavaOutputFormatting {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("=======================================");
		for(int i = 0; i < 3; i++ ) {
			String s1 = sc.next();
			int x = sc.nextInt();
			System.out.printf("%-15s%03d%n",s1,x);
		}
		System.out.println("=======================================");
	}

}
