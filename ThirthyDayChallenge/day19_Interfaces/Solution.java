package ThirthyDayChallenge.day19_Interfaces;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/30-interfaces/problem
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
/* Sample Input
6

Sample Output
I implemented: AdvancedArithmetic
12 */