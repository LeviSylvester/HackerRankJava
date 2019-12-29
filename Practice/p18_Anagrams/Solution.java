package Practice.p18_Anagrams;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-anagrams/problem
public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) return false;
        int c[] = new int[26], d[] = new int[26];
        a = a.toUpperCase();
        b = b.toUpperCase();
        for (int i = 0; i < a.length(); i++) {
            c[a.charAt(i) - 'A']++;
            d[b.charAt(i) - 'A']++;
        }
        for (int i = 0; i < 26; i++)
            if (c[i] != d[i]) return false;
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
/* Sample Input 0:
anagram
margana

Sample Output 0:
Anagrams

Sample Input 1:
anagramm
marganaa

Sample Output 1:
Not Anagrams

Sample Input 2:
Hello
hello

Sample Output 2:
Anagrams */

// Other solutions include:
/** Arrays.sort(a);

 Arrays.sort(b);

 return Arrays.equals(a,b);

 may look like a fine solution but it’s not. A good code is a fast code, not a short code.
 If you look in the API, Arrays.sort(a) works in n log(n), another Arrays.sort(a),
 and we have n log(n) + n log(n) = 2*n*log(n);

 And we still have to do Arrays.equals(a,b), which will be n/2. So altogether 2*n*log(n) + n/2 = n* log(n),
 which is a poor result if we can do it in O(n).

 So the problem is actually like this: we have two sets and we want to compare if they are equal,
 i.e. contain the same elements.
 An extra problem is that the sets can contain duplicates (So we can’t use Hashsets to solve it.)

 When we think about the problem we notice two more things:
 1) When you have two strings: “ace” and Llanfair¬pwllgwyngyll¬gogery¬chwyrn¬drobwll¬llan¬tysilio¬gogo¬goch
 (the longest Welsh word), will you immediately tell that they can’t be anagrams?
 YES, because you see right away they are not the same size.
 With character arrays (this is what the Java Strings are internally) we can check in constant time O(1) the size.
 Java will then also immedaitely tell if these two strings -
 "Llanfair¬pwllgwyngyll¬gogery¬chwyrn¬drobwll¬llan¬tysilio¬gogo¬goch" and
 "Llanfair¬pwllgwyngyll¬gogery¬chwrn¬drobwll¬llan¬tysilio¬gogo¬goch" - are anagrams.
 (They aren’t. I removed a letter from the second string. : - ) )
 Imagine how much unnecessary work would have to be done on all those letters one by one
 to check if those two strings are equal. For this reason I would find it worthwhile to
 include the size test before we do the actual work.

 2) Now, what we don’t really want to do is keep checking all the subsequent letters of string A
 if we discover that the first(or second, or third, etc.) letter of this string is not actually present
 in the second string B or its frequency is different.
 So the idea is to stop checking as soon as we discover that a letter is not present in the second string or
 the number it appears in the first string is different from the number it appears in the second.

 3) Solution:

 a) Put all the letters of string B in a HashMap with a letter as key and
 its frequency as value (just increment the frequency by 1 every time you put the same letter again in the map.)
 Time complexity: (O(n/2)
 One string is like a half of all the letters we provide as arguments to this method (n) – that’s why I divide n by 2.

 b) Next, iterate over the letters of string A (this will be another O(n/2) ) and
 look each letter up in the HashMap. If it’s not there or its frequency is 0, bingo! “Not anagram!”,
 if it’s there, decrement its frequency by one
 (All these operations : look up for a HashTable, comparison, decrement - are O(1).

 Total time compexity then is O(n/2) + O(n/2) = O(n) where n is the number of letters in both strings.

 static boolean isAnagram(String a, String b) {

 // test for invalid input
 if( a == null || b == null || a.equals("") || b.equals("") )
 throw new IllegalArgumentException();

 // initial quick test for non-anagrams
 if ( a.length() != b.length() )
 return false;

 a = a.toLowerCase();
 b = b.toLowerCase();

 // populate a map with letters and frequencies of String b
 Map<Character, Integer> map = new HashMap<>();

 for (int k = 0; k < b.length(); k++){
 char letter = b.charAt(k);

 if( ! map.containsKey(letter)){
 map.put( letter, 1 );
 } else {
 Integer frequency = map.get( letter );
 map.put( letter, ++frequency );
 }
 }

 // test each letter in String a against data in the map
 // return if letter is absent in the map or its  frequency is 0
 // otherwise decrease the frequency by 1

 for (int k = 0; k < a.length(); k++){
 char letter = a.charAt(k);

 if( ! map.containsKey( letter ) )
 return false;

 Integer frequency = map.get( letter );

 if( frequency == 0 )
 return false;
 else
 map.put( letter, --frequency);
 }
 // if the code got that far it is an anagram
 return true;
 } */

//Explanation for this solution:
//if(a.length() != b.length()) return false;
//        int c[] = new int[26], d[] = new int[26] ;
//        a = a.toUpperCase();
//        b = b.toUpperCase();
//        for(int i=0; i<a.length(); i++){
//            c[a.charAt(i) - 'A']++;
//            d[b.charAt(i) - 'A']++;
//        }
//        for(int i =0;i<26; i++)
//            if(c[i] != d[i] ) return false;
//        return true;
//In this ,I am returning false in starting if the string length is not same.
// Now, when they are of same length, then I am simply taking two int arrays of size 26 (total number of alphabets),
// where each index represents the location of each alphabets.
// For example, 0-'A', 1-'B',......upto..,25-'Z'.
// Then i am making the whole string in uppercase to avoid Case sensitivity.
// Now i am traversing both the strings of equal length with a single loop and doing this simple operation:
//
//" character at ith position of string - 'A' ". This gives me the supposed index location of each character in array.
//
//For ex: if charAt(i) is 'A', then, 'A' - 'A' = 0,
// similarly, for B, 'B' - 'A' = 1.......upto...'Z' - 'A ' =25..
// Thus i get the indexes of the characters ,
// and I increment the value of that index on each occurance of the character, which was initially 0.
//
//Note: Array 'c' represents Occurances of each elements in string 'a', and array 'd' is for string 'b'.
//
//Now we compare the occurances of each character in both the arrays.
//If any occurance is not equal then we return False.
// When all the occurances were same and for loop terminates , then we reutrn True.
