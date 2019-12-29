package Practice.p07_JavaLoopsII;

import java.util.*;
import java.io.*;

// https://www.hackerrank.com/challenges/java-loops/problem
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
//if you want to call all answers AFTER all queries entered, save them in an array
            for (int j = 0; j < n; j++) {
                a += b;
                System.out.print(a + " ");
                b *= 2;
            }
            System.out.println();
        }
        in.close();
    }
}
/* Sample Input
2
0 2 10
5 3 5

Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98 */


