import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HelloWorld_input {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        System.out.println("Please input a number: ");
        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();
        int z= i+j;
        System.out.println("The sum is: " + z);
        
        
        System.out.println("Please input a float: ");
        double e = scan.nextDouble();
        double f = d+e;
       
        System.out.printf("The sum of floats is: " + "%.1f\n", f);
        
        
        System.out.println("Please input a String: ");
        String s2 = scan.next();
        s2+=scan.nextLine();
        String s3;
        s3 = s+s2;
        System.out.println("So the string is: " + s3);
        		
        scan.close();
            }
        }