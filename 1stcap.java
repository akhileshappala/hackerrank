import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length1 = A.length();
        int length2 = B.length();
        int total = length1+ length2; 
        System.out.println( total);
        if ( (A).compareTo(B)<=0)
            {
            System.out.println("No" );
        }
            else 
                {
                 System.out.println( "Yes");
                
            }
        String one = A.substring(0, 1).toUpperCase() + A.substring(1);
        String two =  B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(one+ " "+ two);
        }
        
    }


