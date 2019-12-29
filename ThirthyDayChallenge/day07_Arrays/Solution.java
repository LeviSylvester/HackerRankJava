package ThirthyDayChallenge.day07_Arrays;

import java.util.*;

// https://www.hackerrank.com/challenges/30-arrays/problem
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//sets how many ints you wanna add (n)
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//initializes an empty array for n integers
        int[] ints = new int[n];

//splits what you entered with spaces
        String[] stringInts = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//takes every one of it as ints & adds them to ints array
        for (int i = 0; i < n; i++) {
            int integer = Integer.parseInt(stringInts[i]);
            ints[i] = integer;
        }
//prints ints from last integer to first
        for (int j = n-1; j >= 0; j--) {
            System.out.print(ints[j] + " ");
        }
        scanner.close();
    }
}
/* Sample Input
4
1 4 3 2

Sample Output
2 3 4 1 */

