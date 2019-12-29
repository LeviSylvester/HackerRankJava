package Practice.p10_StaticInitializerBlock;

import java.util.*;

public class Solution {

    private static boolean flag;
    private static int B, H;

    static {
//        try {
        final Scanner s = new Scanner(System.in);
        flag = true;
        B = s.nextInt();
        H = s.nextInt();
//        } catch (java.lang.Exception e) {
        if (B > 0 && H > 0) {
            flag = true;
//        } else if ((B <= 0 && H >= 0) || (B >= 0 && H <= 0)) {
//            flag = false;
//            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
//        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class
/* Sample input 1:
1
3

Sample output 1:
3

Sample input 2:
-1
2

Sample output 2:
java.lang.Exception: Breadth and height must be positive */
