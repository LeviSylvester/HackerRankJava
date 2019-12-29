package Practice.p15_Substring;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// https://www.hackerrank.com/challenges/java-substring/problem
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        try {System.out.println(S.substring(start, end));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("no such index");
        }
    }
}
/* Sample Input
Helloworld
3 7

Sample Output
lowo */

//Other solutions include:
//public static void main(String[] args) {
//  Scanner in = new Scanner(System.in);
//  System.out.print(in.next().substring(in.nextInt(),in.nextInt()));
//}

//System.out.println(S.substring(start,end));

