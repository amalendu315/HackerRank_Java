package com.javadatatypes;
import java.util.*;

public class JavaDataTypes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		for(int i = 0;i<a; i++) {
			try{
				long x = in.nextLong();
				System.out.println(x+" can be fitted in:-");
				if(x>=-128 && x<=127) {
					System.out.println("* byte");
				}
				if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE) {
					System.out.println("* short.");
				}
				if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE) {
					System.out.println("* int.");
				}
				if(x>=Long.MIN_VALUE && x<=Integer.MAX_VALUE) {
					System.out.println("* long");
				}
			}catch(Exception e) {
				System.out.println(in.next()+" can't be fitted anywhere.");
			}
		}
		in.close();
	}

}
