package Practice.p20_PatternSyntaxChecker;

import java.util.Scanner;
import java.util.regex.*;

import static java.util.regex.Pattern.compile;

// https://www.hackerrank.com/challenges/pattern-syntax-checker/forum
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            //Write your code
            try {
                compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e/*IllegalArgumentException e*/) {
                System.out.println("Invalid");
            } finally {
                testCases--;
            }
        }
        in.close();
    }
}
/* Sample Input
3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat

Sample Output
Valid
Invalid
Invalid */

//Other solutions include:

//import java.util.Scanner;
//import java.util.regex.Pattern;
//import java.util.regex.PatternSyntaxException;
//
///* If a PatternSyntaxException is not thrown by Pattern.compile,
//   then the regular expression is valid.
//*/
//public class Solution {
//    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        int testCases = scan.nextInt();
//        scan.nextLine(); // gets rid of the pesky newline.
//        while (testCases-- > 0){
//           String pattern = scan.nextLine();
//           try {
//               Pattern.compile(pattern);
//               System.out.println("Valid");
//           } catch (PatternSyntaxException exception) {
//               System.out.println("Invalid");
//           }
//        }
//        scan.close();
//    }
//}

//put testCases--; in finnaly block

//has anyone come accross this exception even if your solution is valid
//
//Error (stderr): Exception in thread "main" java.util.NoSuchElementException: No line found at java.util.Scanner.nextLine(Scanner.java:1540) at Solution.main(DuplicateWords.java:10)
//
//simple fix below removed it
//
//    while(testCases>0){
//
//    /**
//    *this block removes the NoSuchElementException exception
//    */
//      try{
//
//           String pattern = in.nextLine();
//
//          try{
//              Pattern p = Pattern.compile(pattern);
//          }catch(PatternSyntaxException exception){
//              System.out.println("Invalid");
//              continue;
//          }
//          System.out.println("Valid");
//      }catch (Exception  e){
//          //
//      }
//      testCases--;
//  }
