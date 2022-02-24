package com.javaloops;
import java.util.*;

public class JavaLoops {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt();
		int i = 1;
		for(i=1;i<=10;i++) {
			int result = N * i;
			System.out.println(N +" "+"x"+ " "+ i +" "+"="+" "+ result);
		}
	}

}
