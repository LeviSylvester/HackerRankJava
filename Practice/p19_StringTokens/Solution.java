package Practice.p19_StringTokens;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/java-string-tokens/problem
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
//        s.trim();
        StringTokenizer st = new StringTokenizer(s,("[_\\@!?.', ]"));
        int x = st.countTokens();
        System.out.println(x);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        scan.close();
    }

}
/* Sample Input:
He is a very very good boy, isn't he?

Sample Output:
10
He
is
a
very
very
good
boy
isn
t
he */
