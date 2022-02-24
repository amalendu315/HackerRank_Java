package com.javaloops2;
import java.util.*;

public class JavaLoops2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for(int i = 0;i<q;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int calc = a;
			for(int j = 0; j<n;j++) {
				calc+=(Math.pow(2,j)*b);
				System.out.println(calc+" ");
			}
			System.out.println();
		}
		in.close();
	}

}
