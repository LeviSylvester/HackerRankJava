package Practice.p09_EndOfFile;

import java.util.*;

import static java.lang.System.out;

// https://www.hackerrank.com/challenges/java-end-of-file/problem
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        //Choose between 4 for loops and 1 while loop: :))))))
        for(int i=1;in.hasNext();out.println(i+++" "+in.nextLine()));
//        int i = 1;
//        while(scanner.hasNext()){
//            System.out.println(i + " " + scanner.nextLine());
//            i++;
//        }

//        for (int i = 1; scanner.hasNext(); i++) {
//            System.out.println(i + " " + scanner.nextLine());
//        }

        //for(int i = 1; scan.hasNext(); System.out.println(i + " " + scan.nextLine()), i++);

        //for(int i=1; scan.hasNext() ; System.out.println(i++ +" "+scan.nextLine()));

    }
}
/* Sample Input:
Hello world
I am a file
Read me until end-of-file.

Sample Output:
1 Hello world
2 I am a file
3 Read me until end-of-file. */
