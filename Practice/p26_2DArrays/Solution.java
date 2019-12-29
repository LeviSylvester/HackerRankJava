package Practice.p26_2DArrays;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-2d-array/problem
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

//Other solutions include:
//import java.io.*;
//import java.util.*;
//
//public class Solution
//{
//    public static void main(String[] args)
//    {
//        int a[][] = new int[6][6];
//        int maxSum = Integer.MIN_VALUE;
//        try (Scanner scanner = new Scanner(System.in);)
//        {
//            for(int i = 0; i < 6; i++)
//            {
//                for(int j = 0; j < 6; j++)
//                {
//                    a[i][j] = scanner.nextInt();
//                    if (i > 1 && j > 1)
//                    {
//                        int sum =
//                            a[i][j]
//                            + a[i][j-1]
//                            + a[i][j-2]
//                            + a[i-1][j-1]
//                            + a[i-2][j]
//                            + a[i-2][j-1]
//                            + a[i-2][j-2];
//                        if (sum > maxSum) {maxSum = sum;}
//                    }
//                }
//            }
//        }
//        System.out.println(maxSum);
//    }
//}
//It has the advantage to not run through the array a second time
//and instead calculate the results as soon as the data to do it is available.

//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        int maxVal = Integer.MIN_VALUE;
//
//        Scanner in = new Scanner(System.in);
//        int arr[][] = new int[6][6];
//        for(int i=0; i < 6; i++){
//            for(int j=0; j < 6; j++){
//                arr[i][j] = in.nextInt();
//            }
//        }
//
//        for(int i=0; i < 6; i++){
//            for(int j=0; j < 6; j++){
//                if(i > 3 || j > 3) continue;
//
//                int glassSum =
//                    arr[j][i]   + arr[j][i+1]   + arr[j][i+2]
//                                + arr[j+1][i+1] +
//                    arr[j+2][i] + arr[j+2][i+1] + arr[j+2][i+2];
//
//                if(glassSum > maxVal) maxVal = glassSum;
//            }
//        }
//
//        System.out.print(maxVal);
//    }
//}

//int maxValue=Integer.MIN_VALUE,sum=0;
//       for(int i=0;i<4;i++){
//        	for(int k=0;k<4;k++){
//        		sum=arr[i][k]+arr[i][k+1]+arr[i][k+2]+arr[i+1][k+1]
//        		+arr[i+2][k]+arr[i+2][k+1]+arr[i+2][k+2];
//        		if(sum > maxValue){maxValue=sum;}
//        	}
//        }
//        System.out.println(maxValue);

//import java.util.Scanner;
//
//public class Solution {
//
//    public static void main(String [] args) {
//        Scanner scan = new Scanner(System.in);
//        int arr[][] = new int[6][6];
//        for (int row = 0; row < 6; row++) {
//            for (int col = 0; col < 6; col++) {
//                arr[row][col] = scan.nextInt();
//            }
//        }
//        scan.close();
//
//        System.out.println(maxHourglass(arr));
//    }
//
//    public static int maxHourglass(int [][] arr) {
//        int max = Integer.MIN_VALUE;
//        for (int row = 0; row < 4; row++) {
//            for (int col = 0; col < 4; col++) {
//                int sum = findSum(arr, row, col);
//                max = Math.max(max, sum);
//            }
//        }
//        return max;
//    }
//
//    private static int findSum(int [][] arr, int r, int c) {
//        int sum = arr[r+0][c+0] + arr[r+0][c+1] + arr[r+0][c+2]
//                                + arr[r+1][c+1] +
//                  arr[r+2][c+0] + arr[r+2][c+1] + arr[r+2][c+2];
//        return sum;
//    }
//}

//I tried 4 approaches, the first 2 using conventional summation. As expected, both of these were the fastest, but what I didn't expect to see was that solution 1 had a distinct advantage over #2. (The delta was small but consistently ~ 2x). Despite this, I personally favor #2 unless performance is a major concern - strictly because it would be the easiest to maintain.
//
//The 3rd and 4th approaches both used the Java8 stream/lambda functionality (mostly for my curiousity). As expected both approaches were measurably slower than #1 (100-150x and 110-200x slower respectively). I would caution anyone to take too much from this as overhead in this problem(and my inexperience with streams) overwhelmed any benefit from using streams.
//
//    // Approach 1: explicitly add the array values (TIED FASTEST)
//    private static int solve1(int[][] arr) {
//
//        int maxValue = Integer.MIN_VALUE;
//        int width = arr[0].length - 2;
//
//        for (int row = 0; row < arr.length - 2; row++) {
//            for (int col = 0; col < width; col++) {
//
//                maxValue = Math.max(maxValue,
//                        arr[row][col] + arr[row][col+1] + arr[row][col+2] +
//                        arr[row + 1][col + 1] +
//                        arr[row+2][col] + arr[row+2][col+1] + arr[row+2][col+2]);
//            }
//        }
//        return maxValue;
//    }
//
//    // Approach 2: Inner loop to sum top/bottom rows (2ND FASTEST)
//    private static int solve2(int[][] arr) {
//
//        int maxValue = Integer.MIN_VALUE;
//        int width = arr[0].length - 2;
//
//        int total = 0;
//        for (int row = 0; row < arr.length - 2; row++) {
//            for (int col = 0; col < width; col++) {
//
//                total = arr[row + 1][col + 1]; // center
//                for (int pos = col; pos < col + 3; pos++) {
//                    // add the top/bottom rows
//                    total += arr[row][pos] + arr[row + 2][pos];
//                }
//
//                maxValue = Math.max(maxValue, total);
//            }
//        }
//        return maxValue;
//    }
//
//    // Approach 3: Use streams to sum top/bottom rows (2ND SLOWEST)
//    private static int solve3(int[][] arr) {
//        int maxValue = Integer.MIN_VALUE;
//        int width = arr[0].length - 2;
//
//        for (int row = 0; row < arr.length - 2; row++) {
//            for (int j = 0; j < width; j++) {
//
//                maxValue = Math.max(
//                        maxValue,
//                        Arrays.stream(arr[row], j, j + 3).sum()
//                                + arr[row + 1][j + 1]
//                                + Arrays.stream(arr[row + 2], j, j + 3).sum());
//            }
//        }
//
//        return maxValue;
//    }
//
//    // Approach 4: Use stream to loop/sum rather than for loops (SLOWEST)
//    private static int solve4(int[][] arr) {
//
//        int width = arr[0].length - 2;
//        return IntStream.range(0, arr.length - 2).map(
//                (row) -> IntStream.range(0, width).map(
//                        col -> Arrays.stream(arr[row], col, col + 3).sum()
//                                + arr[row + 1][col + 1]
//                                + Arrays.stream(arr[row + 2], col, col + 3).sum()
//
//                ).max().getAsInt()
//        ).max().getAsInt();
//
//    }

//int A=0,temp=-63,sum=0;
//    while(A<4){
//        int B=0;
//        while(B<4){
//            int C=A;
//            while(C<A+3){
//                int D=B;
//                while(D<B+3){
//                    if(C==A+1 && D==B){
//
//                    }else if(C==A+1 && D==B+2){
//
//                    }else{
//                        sum += arr[C][D];
//                    }
//                    D++;
//                }
//                C++;
//            }
//            if(sum > temp){
//                temp = sum;
//            }
//            sum = 0;
//            B++;
//        }
//        A++;
//    }
//    System.out.println(temp+" ");

