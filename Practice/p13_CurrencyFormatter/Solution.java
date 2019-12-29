package Practice.p13_CurrencyFormatter;

import java.util.*;
import java.text.*;

// https://www.hackerrank.com/challenges/java-currency-formatter/problem
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale indiaLocale = new Locale("en", "IN");

        String us     = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india  = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
        String china  = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
/* Sample Input
12324.134

Sample Output
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 € */

//Other solutions include:
//NumberFormat defaultFormat =
//NumberFormat.getCurrencyInstance(Locale.US);
//NumberFormat indiaFormat =
//NumberFormat.getCurrencyInstance(new Locale("en","IN"));
//NumberFormat chinaFormat =
//NumberFormat.getCurrencyInstance(Locale.CHINA);
//NumberFormat franceFormat =
//NumberFormat.getCurrencyInstance(Locale.FRANCE);
//
////Print
//System.out.printf(
//"US: %-2s\nIndia: %-2s\nChina: %-2s\nFrance: %-2s",
//defaultFormat.format(payment), indiaFormat.format(payment),
//chinaFormat.format(payment), franceFormat.format(payment)
//);

///* Create custom Locale for India.
//          I used the "IANA Language Subtag Registry" to find India's country code */
//        Locale indiaLocale = new Locale("en", "IN");
//
//        /* Create NumberFormats using Locales */
//        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
//        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
//        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
//        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
//
//        /* Print output */
//        System.out.println("US: "     + us.format(payment));
//        System.out.println("India: "  + india.format(payment));
//        System.out.println("China: "  + china.format(payment));
//        System.out.println("France: " + france.format(payment));


