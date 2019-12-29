package ThirthyDayChallenge.day06_LoopsAndStrings;

import java.util.*;

// https://www.hackerrank.com/challenges/30-review-loop/problem
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        char[] sArray;
        String[] tArray = new String[t];
        for (int i = 0; i < t; i++) {
            tArray[i] = scanner.next();
        }
        for (int j = 0; j < t; j++) {
            sArray = tArray[j].toCharArray();
            for (int e = 0; e < sArray.length; e++) {
                if (e % 2 == 0) {
                    System.out.print(sArray[e]);
                }
            }
            System.out.print(" ");
            for (int o = 1; o < sArray.length; o++) {
                if (o % 2 == 1) {
                    System.out.print(sArray[o]);
                }
            }
            System.out.println();
        }

    }
}
/* Sample Input
2
Hacker
Rank

Sample Output
Hce akr
Rn ak */
