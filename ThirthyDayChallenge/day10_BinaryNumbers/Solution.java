package ThirthyDayChallenge.day10_BinaryNumbers;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/30-binary-numbers/problem
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] ones = Integer.toBinaryString(n).split("[0]+");
        int max = 0;
        for (String s : ones) {
            if (s.length() > max)
                max = s.length();
        }
        System.out.println(max);

        scanner.close();
    }
}
/* Sample Input 1:
5
Sample Output 1:
1

Sample Input 2:
13
Sample Output 2:
2 */

// other solutions:

//    int n = in.nextInt();
//    int consec1=0;
//    String strBinary = Integer.toString(n, 2);
//   // above is binary of given in in string
//    String[] strparts = strBinary.split("0");
//    //above we get all strings of ones, below find max from them
//    for(int i=0;i<strparts.length;i++ ){
//        if (consec1 < strparts[i].length()) {
//            consec1 = strparts[i].length();}
//    }
//    System.out.println(consec1);  //result

//        int n = scanner.nextInt();
//        String bin[] = Integer.toBinaryString(n).split("0+");
//        Arrays.sort(bin);
//        System.out.println(bin[bin.length-1].length());
//        scanner.close();

//int n = in.nextInt();
//
//          long m = n;
//          int maxCount = 0;
//          int count = 0;
//          long prev = -1;
//          while(m != 0) {
//
//          long current = m & 1;
//          if(current == 1 && current == prev) {
//              count++;
//          }else {
//              count = 1;
//          }
//          if(count > maxCount){
//              maxCount = count;
//          }
//          prev = current;
//          m = m >> 1;
//      }
//
//
//    System.out.println(maxCount);
//    in.close();

//      int n = in.nextInt();
//      in.close(); String intToBinary = Integer.toBinaryString(n);
//      int consecutiveOne = 0;
//      for (String str : intToBinary.split("0")) {
//            consecutiveOne = str.length() > consecutiveOne ? str.length() : consecutiveOne;
//      } System.out.println(consecutiveOne);

//      int n = in.nextInt();
//      int counter = 0, max =0;
//      while (n > 0) {
//          int rem = n%2;
//          if (rem==1) {
//              counter++;
//          } else {
//              counter=0;
//          }
//      max = Math.max(counter, max);
//      n/=2;
//      }
//  System.out.println(max);

//      int n = in.nextInt();
//      int counter = 0, max =0;
//      while (n > 0) {
//          counter = ++counter * (n%2);
//          max = Math.max(counter, max);
//          n/=2;
//      }
//      System.out.println(max);

//  String[] binary = Integer.toBinaryString(n).split("0");
//  int count = 0;
//  for(int i = 0; i < binary.length; i++){
//		count = binary[i].length() > count ? binary[i].length() : count;
//  }
//  System.out.println(count);

//        int n = in.nextInt();
//        String[] ones = Integer.toBinaryString(n).split("[0]+");
//        int max = 0;
//        for (String s : ones) {
//            if (s.length() > max)
//                max = s.length();
//        }
//        System.out.println(max);

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int rem = 0, s = 0, t = 0;
//
//
//        while (n > 0) {
//            rem = n % 2;
//            n = n / 2;
//            if (rem == 1) {
//                s++;
//                if (s >= t)
//
//                    t = s;
//
//            } else {
//
//                s = 0;
//            }
//        }
//
//        System.out.println(t);

