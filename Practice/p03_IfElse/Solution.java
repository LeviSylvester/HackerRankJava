package Practice.p03_IfElse;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// https://www.hackerrank.com/challenges/java-if-else/problem
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    private static String isWeird(int n) {
        if (n % 2 == 1) {
            return "Weird";
        } else {
            return (n > 20 ? "Not Weird" :
                    n > 5 ? "Weird" :
                    n > 2 ? "Not Weird" : "");
        }
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        System.out.print(isWeird(n));
    }
}
/* Sample Input 0
3

Sample Output 0
Weird

Sample Input 1
24

Sample Output 1
Not Weird */

