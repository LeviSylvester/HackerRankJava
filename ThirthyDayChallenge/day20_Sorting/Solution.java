package ThirthyDayChallenge.day20_Sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// https://www.hackerrank.com/challenges/30-sorting/problem
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        // Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                    numberOfSwaps++;
                }
            }
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
}
/* Sample Input 0:
3
1 2 3

Sample Output 0:
Array is sorted in 0 swaps.
First Element: 1
Last Element: 3

Sample Input 1:
3
3 2 1

Sample Output 1:
Array is sorted in 3 swaps.
First Element: 1
Last Element: 3 */

//Other solutions include:

//C# solution:
//class Solution
//{
//    static void swap(ref int a,ref int b)
//    {
//        int c = a;
//        a = b;
//        b = c;
//    }
//    static void Main(string[] args)
//    {
//        int n = Convert.ToInt32(Console.ReadLine());
//        string[] a_temp = Console.ReadLine().Split(' ');
//        int[] a = Array.ConvertAll(a_temp, Int32.Parse);
//
//        int numberOfSwaps = 0;
//
//        for (int i = 0; i < n; i++)
//        {
//            for (int j = 0; j < n - 1; j++)
//            {
//                if (a[j] > a[j + 1])
//                {
//                    swap(ref a[j],ref a[j + 1]);
//                    numberOfSwaps++;
//                }
//            }
//            if (numberOfSwaps == 0)
//            {
//                break;
//            }
//        }
//        Console.WriteLine("Array is sorted in {0} swaps.", numberOfSwaps);
//        Console.WriteLine("First Element: {0}", a[0]);
//        Console.WriteLine("Last Element: {0}", a[n - 1]);
//    }
//}