package com.javastdinstdout2;
import java.util.*;
public class JavaStdInStdOut2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		double d = sc.nextDouble();
		sc.nextLine();
		String s = sc.nextLine();
		sc.close();
		System.out.println("String is: "+s);
		System.out.println("Double is: "+d);
		System.out.println("Int is: "+i);
		
	}

}
