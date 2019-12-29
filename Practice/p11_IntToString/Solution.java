package Practice.p11_IntToString;

import java.util.*;

// https://www.hackerrank.com/challenges/java-int-to-string/problem
public class Solution {
    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            //String s=???; Complete this line below

            //Write your code here
            String s = String.valueOf(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}
/* Sample Input 0
100

Sample Output 0
Good job */

/* There are many ways to convert an Integer to String in Java e.g. by using
Integer.toString(int) or by using
String.valueOf(int), or by using
new Integer(int).toString(), or by using
String.format() method, or by using
DecimalFormat,
String concatenation, or by using
StringBuilder and StringBuffer etc. */


