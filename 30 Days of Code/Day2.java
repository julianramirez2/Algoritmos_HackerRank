import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int integer = 0;
        double double_s = 0;
        String string_s = "";

        /* Read and save an integer, double, and String to your variables.*/
        
        integer = scan.nextInt();
        double_s = scan.nextDouble();
        scan.nextLine();
        string_s = scan.nextLine();
        
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
            System.out.println(i+integer);
        /* Print the sum of the double variables on a new line. */
             System.out.println(d+double_s);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
            System.out.println(s+string_s);

        scan.close();
    }
}
