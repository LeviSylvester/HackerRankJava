package ThirthyDayChallenge.day03_ConditionalStatments;

import java.util.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if (N % 2 == 1) {
            System.out.println("Weird");
        } else if ((N % 2 == 0) && ((N >=2) && (N <= 5))) {
            System.out.println("Not Weird");
        } else if ((N % 2 == 0) && ((N >=6) && (N <= 20))) {
            System.out.println("Weird");
        } else if ((N % 2 == 0) && (N > 20)) {
            System.out.println("Not Weird");
        } else {
            System.out.println("This number must be between 1 and 100");
        }

        //saw it could be simplified, but nothing beats the code found in Discussions (C#?):
//        //int main(){
//
//        int N;
//
//        scanf("%d",&N);
//
//        if( N%2 == 1 || (N > 5 && N < 21))
//
//            printf("Weird");
//
//        else
//
//            printf("Not Weird");
//
//        //return 0;
//        //}
    }
}
/* Sample Input 0
3

Sample Output 0
Weird

Sample Input 1
24

Sample Output 1
Not Weird */
