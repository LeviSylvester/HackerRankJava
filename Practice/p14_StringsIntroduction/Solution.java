package Practice.p14_StringsIntroduction;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/java-strings-introduction/problem
public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println((A + B).length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }
}
/* Sample Input 0
hello
java

Sample Output 0
9
No
Hello Java */

//Other solutions include:
//System.out.println(A.length()+B.length());
//System.out.println(A.compareTo(B)>0?"Yes":"No");
//System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));

//System.out.println( A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));

//System.out.printf("%d\n%s\n%s\n",
//          (A+B).length(),
//          A.compareTo(B)>0?"Yes":"No",
//          A.substring(0,1).toUpperCase()
//                  + A.substring(1)
//                  + " "
//                  + B.substring(0,1).toUpperCase()
//                  + B.substring(1));

//public static String capitalize(String s) {
//        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
//    }

//public static String capitalize(String original) {
//    if (original == null || original.length() == 0) {
//        return original;
//    }
//    return original.substring(0, 1).toUpperCase() + original.substring(1);
//}
//
//public static void main(String[] args) {
//
//    Scanner sc=new Scanner(System.in);
//    String A=sc.next();
//    String B=sc.next();
//    sc.close();
//    System.out.println((A+B).length());
//    System.out.println(A.compareTo(B)>0?"Yes":"No");
//    System.out.println(capitalize(A)+" "+capitalize(B));
//
//}

//        /* Sum lengths */
//        System.out.println(A.length() + B.length());
//
//        /* Compare lexicographical ordering */
//        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
//
//        /* Print the Strings in desired format */
//        System.out.println(capFirstLetter(A) + " " + capFirstLetter(B));
//    }
//
//    private static String capFirstLetter(String str) {
//        if (str == null || str.length() == 0) {
//            return "";
//        } else {
//            return str.substring(0,1).toUpperCase() + str.substring(1);
//        }
//    }