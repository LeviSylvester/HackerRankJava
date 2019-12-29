package Practice.p17_StringReverse;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/java-string-reverse/problem
public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        //the question is whether we'd need the shortest code or the fastest to execute on a large scale
        System.out.println(A.equals("" + new StringBuilder(A).reverse()) ? "Yes" : "No");
    }
}
/* Sample Input
madam

Sample Output
Yes */

//Other solutions include:

//prints the WORD & only checks for Palindrome if 1st char equals last
//        if (A.charAt(0) == A.charAt(A.length()-1)){
//            System.out.println(A.equals(new StringBuilder(A).reverse().toString()) ? A : "");
//        }

//        System.out.println(A.equalsIgnoreCase(new StringBuilder(A).reverse().toString())? "Yes": "No");

//        System.out.println(A.equals(new StringBuilder(A).reverse().toString())? "Yes": "No");

//        StringBuilder stringBuilderA = new StringBuilder(A);
//        System.out.println(stringBuilderA.reverse().toString().equalsIgnoreCase(A)?"Yes":"No");

//        StringBuilder stringBuilder = new StringBuilder();
//        String reverseA = stringBuilder.append(A).reverse().toString()
//        if (A.equalsIgnoreCase(reverseA)) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("no");
//        }

//        StringBuilder stringBuilder = new StringBuilder();
//        final String isPalindrome = stringBuilder.append(A).reverse().toString().equalsIgnoreCase(A) ? "Yes": "No";
//        System.out.println(isPalindrome);

//        StringBuilder stringBuilder = new StringBuilder();
//        final boolean isPalindrome = stringBuilder.append(A).reverse().toString().equalsIgnoreCase(A);
//        System.out.println(isPalindrome); //outputs true or false instead of Yes or No

//int count = 0;
//for(int i=0; i<A.length()/2;i++)
//    if( A.charAt(i) == A.charAt(A.length()-i-1)) count++;
//System.out.println( (count == A.length()/2) ? "Yes" : "No") ;

/**
 * Imagine we want to test one million words from a dictionary to see how many palindromes there are in a language. You solution will reverse ALL the pairs of letters in each word. If a word is 50 letters long, it will reverse 25 pairs of letters.
 * <p>
 * Why do the test on ALL the pairs of letters? Only perhaps 10 000 words out of a million will be palindromes, but this algorithm will reverse all the letters in all the words! How about writing a code that will just test if a given pair of letters is identical (no reversing either!) and will quit testing immediately after the pair of letters which are not identical? This test will do the job:
 * <p>
 * if (word.charAt(first) != word.charAt(last))
 * return "No";
 * }
 * Time performance of your solution will be n * (k / 2)
 * (n is number of words, k is number of letters in each word.) It will be proportional to the number of LETTERS in the dictionary.
 * <p>
 * Time performance of my solution will be closer to n (the number of WORDS in the dictionary) because most words turn out NOT to be palindromes after 1-3 checks. So, for a million words the user should feel the difference. And what if you wanted to compare the number of palindormes in all dictionaries of all languages? (:-) For the processor and ... the user, BEAUTY IS SPEED.
 * <p>
 * public static void main(String[] args) {
 * Scanner sc=new Scanner(System.in);
 * String A=sc.next();
 * String result = isPalindrome(A, 0, A.length()-1);
 * System.out.println(result);
 * }
 * <p>
 * public static String isPalindrome(String word, int first, int last){
 * <p>
 * if (word == null || "".equals(word))
 * return "The string is null or empty.";
 * <p>
 * return isPalindRecursive(word.toLowerCase(), first, last);
 * }
 * <p>
 * <p>
 * private static String isPalindRecursive(String word, int first, int last){
 * <p>
 * if (first >= last)
 * return "Yes";
 * <p>
 * if (word.charAt(first) != word.charAt(last))
 * return "No";
 * <p>
 * return isPalindRecursive(word, ++first, --last);
 * }
 * The iterative version would be faster from what I've read... But, I wanted to have a little exercise at recursion.... :-)
 */

//https://www.geeksforgeeks.org/reverse-a-string-in-java/

