package ThirthyDayChallenge.day11_2DArrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// https://www.hackerrank.com/challenges/30-2d-arrays/problem
public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();
        int hourGlassSum = arr[0][0] + arr[0][1] + arr[0][2] +
                                       arr[1][1] +
                           arr[2][0] + arr[2][1] + arr[2][2];
        int max = hourGlassSum;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                hourGlassSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] +
                                           arr[i + 1][j + 1] +
                               arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (hourGlassSum > max) {
                    max = hourGlassSum;
                }
            }
        }
        System.out.println(max);
    }
}
/* Sample Input
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output
19 */

