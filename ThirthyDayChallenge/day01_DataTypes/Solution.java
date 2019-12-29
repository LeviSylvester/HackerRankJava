package ThirthyDayChallenge.day01_DataTypes;

import java.util.*;

/*12
4.0
is the best place to learn and practice coding!*/
public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int i1;
        double d1;
        String s1;

        i1 = scan.nextInt(); //reads the next token as int
        d1 = scan.nextDouble(); //reads the next token as double
//        s1 = scan.next(); //reads the next token
//        s1 += scan.nextLine(); //reads (and adds) the remaining line (until beginning of next line)
        scan.nextLine(); //reads from the last token to the next line
        s1 = scan.nextLine(); //reads from the last token (beginning of current line) to the next line

        System.out.println(i + i1);
        System.out.println(d + d1);
        System.out.println(s + s1);

        scan.close();
    }
}
