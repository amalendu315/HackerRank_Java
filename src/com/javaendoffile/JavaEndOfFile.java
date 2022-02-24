package com.javaendoffile;
import java.util.*;
public class JavaEndOfFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1 ; sc.hasNext() == true ; i++) {
			System.out.println(i + " " + sc.nextLine());
		}
	sc.close();	
	}
}
