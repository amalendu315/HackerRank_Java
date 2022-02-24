package com.javadateandtime;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    public static String findDay(int month, int day, int year) {
        int d = Integer.valueOf(day);
        int m = Integer.valueOf(month);
        int y = Integer.valueOf(year);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, d);
        calendar.set(Calendar.MONTH, m - 1);
        calendar.set(Calendar.YEAR, y);
        String result = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, new Locale("en", "US")).toUpperCase();
        return result ;
    }

}

public class JavaDateandTime {

	public static void main(String[] args) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int month = Integer.parseInt(firstMultipleInput[0]);

	        int day = Integer.parseInt(firstMultipleInput[1]);

	        int year = Integer.parseInt(firstMultipleInput[2]);

	        String res = Result.findDay(month, day, year);

	        bufferedWriter.write(res);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
		}
		catch(Exception e) {
			System.out.println("Uncaught Exception");
		}

	}

}
