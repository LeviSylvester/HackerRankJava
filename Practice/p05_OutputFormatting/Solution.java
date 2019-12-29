package Practice.p05_OutputFormatting;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-output-formatting/problem
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}
/* Sample Input:
java 100
cpp 65
python 50

Sample Output:
================================
java           100
cpp            065
python         050
================================ */