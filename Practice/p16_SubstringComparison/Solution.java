package Practice.p16_SubstringComparison;

import java.util.*;

// https://www.hackerrank.com/challenges/java-string-compare/problem
public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = smallest;
        for (int i = 0; i < (s.length() - (k - 1)); i++) {
            String subString = s.substring(i, i + k);
            if (subString.compareTo(smallest) < 0) {
                smallest = subString;
            } else if (subString.compareTo(largest) > 0) {
                largest = subString;
            }
        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
/* Sample Input 0
welcometojava
3

Sample Output 0
ava
wel */

//Other solutions include:
//Part of:
//        String[] sArray = new String[s.length()];
//        for (int i = 0; i < (s.length()-(k-1)); i++) {
//            sArray[i] = s.substring(i, k-1);
//        }

//    public static String getSmallestAndLargest(String s, int k) {
//        List<String> sList = new ArrayList<>();
//        for (int i = 0; i < (s.length() - (k-1)); i++) {
//            sList.add(s.substring(i, i + k));
//        }
//        Collections.sort(sList);
//        String smallest = sList.get(0);
//        String largest = sList.get(sList.size() - 1);
//
//        // Complete the function
//        // 'smallest' must be the lexicographically smallest substring of length 'k'
//        // 'largest' must be the lexicographically largest substring of length 'k'
//
//        return smallest + "\n" + largest;
//    }

//public static void main(String[] args) {
//    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//    Scanner scan=new Scanner(System.in);
//    String str=scan.next();
//    int k=scan.nextInt();
//    SortedSet<String> sets=new TreeSet<String>();
//    for(int i=0;i<=str.length()-k;i++){
//        sets.add(str.substring(i,i+k));
//    }
//    System.out.println(sets.first());
//    System.out.println(sets.last());
//}

//implement Comparator Interface and use the Compare method like this:-
//
//public class comp Implement Comparator {
//
//public int compare (Object x, Object y){
//         return (String)x.length() - (String)y.length();
//    }
//}
//
////Then Use the collection.sort() as
//
//Comp c1 = new Comp() ;
//
//Collections.sort(sub,c1) ; //This Now can sort on the basis of Compare method