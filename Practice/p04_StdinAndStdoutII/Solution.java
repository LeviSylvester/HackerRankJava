package Practice.p04_StdinAndStdoutII;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-stdin-stdout/problem
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        //Note:
        // If you use the nextLine() method
        // immediately following the nextInt() method,
        // recall that nextInt() reads integer tokens;
        // because of this, the last newline character
        // for that line of integer input is still
        // queued in the input buffer and the next
        // nextLine() will be reading the remainder
        // of the integer line (which is empty).

        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
/* Sample Input:
42
3.1415
Welcome to HackerRank's Java tutorials!

Sample Output:
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42 */