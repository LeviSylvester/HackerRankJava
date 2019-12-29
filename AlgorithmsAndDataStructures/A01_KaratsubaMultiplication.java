package AlgorithmsAndDataStructures;

import java.util.Scanner;

//work in progress...
public class A01_KaratsubaMultiplication {
    /** Function to multiply two numbers **/
    public long multiply(long x, long y)
    {
        int size1 = getSize(x);
        int size2 = getSize(y);
        /** Maximum of lengths of number **/
        int N = Math.max(size1, size2);
        /** for small values directly multiply **/
        if (N < 10)
            return x * y;
        /** max length divided, rounded up **/
        N = (N / 2) + (N % 2);
        /** multiplier **/
        long m = (long)Math.pow(10, N);

        /** compute sub expressions **/
        long b = x / m;
        long a = x - (b * m);
        long d = y / m;
        long c = y - (d * N);
        /** compute sub expressions **/
        long z0 = multiply(a, c);
        long z1 = multiply(a + b, c + d);
        long z2 = multiply(b, d);

        return z0 + ((z1 - z0 - z2) * m) + (z2 * (long)(Math.pow(10, 2 * N)));
    }
    /** Function to calculate length or number of digits in a number **/
    public int getSize(long num)
    {
        int ctr = 0;
        while (num != 0)
        {
            ctr++;
            num /= 10;
        }
        return ctr;
    }
    /** Main function **/
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Karatsuba Multiplication Algorithm Test\n");
        /** Make an object of Karatsuba class **/
        A01_KaratsubaMultiplication kts = new A01_KaratsubaMultiplication();

        /** Accept two integers **/
        System.out.println("Enter two integer numbers\n");
        long n1 = scan.nextLong();
        long n2 = scan.nextLong();
        /** Call function multiply of class Karatsuba **/
        long product = kts.multiply(n1, n2);
        System.out.println("\nProduct : "+ product);
    }
}
//    private static int x;
//    private static int y;
////    public static int getX() {
////        return x;
////    }
////    public static int getY() {
////        return y;
////    }
////    private static void setX(int x) {
////        A01_KaratsubaMultiplication.x = x;
////    }
////    private static void setY(int y) {
////        A01_KaratsubaMultiplication.y = y;
////    }
////    private static String xString = x + "";
////    private static String yString = y + "";
//    private static int n = (x + "").length();
//    private static int a = Integer.parseInt((x + "").substring(0, n / 2));
//    private static int b = Integer.parseInt((x + "").substring(n / 2));
//    private static int c = Integer.parseInt((y + "").substring(0, n / 2));
//    private static int d = Integer.parseInt((y + "").substring(n / 2));
//    private static int ac = a * c;
//    private static int bd = b * d;
//    private static int ad = a * d;
//    private static int bc = b * c;
//
////    private static int multiply(int x, int y) {
////        //clearify and implement what happens if x &/ y are of odd n digits
////        int result = 0;
////        String xString = x + "";
////        String yString = y + "";
//////        int a = Integer.parseInt(xString.substring(0, 2));
//////        int b = Integer.parseInt(xString.substring(2));
//////        int c = Integer.parseInt(yString.substring(0, 2));
//////        int d = Integer.parseInt(yString.substring(2));
//////        multiply(a, b);
//////        int step1 = a*c;
//////        int step2 = b*d;
//////        int step3 = (a+b)*(c+d);
//////        int step4 = step3-step2-step1;
//////        int step5I = step1 * (int)Math.pow(10, 4) ;
////////        int step5II = step2;
//////        int step5III = step4 * (int)Math.pow(10, 2);
//////        result = step5I + step2 + step5III;
//////        return result;
//////        a = (int)Math.pow(10, n/2);
////        int n = xString.length();
////        int a = Integer.parseInt(xString.substring(0, n / 2));
////        int b = Integer.parseInt(xString.substring(n / 2));
////        int c = Integer.parseInt(yString.substring(0, n / 2));
////        int d = Integer.parseInt(yString.substring(n / 2));
////        int ac = a * c;
////        int bd = b * d;
////        int ad = a * d;
////        int bc = b * c;
////        return (int) Math.pow(10, n) * ac + (int) Math.pow(10, n / 2) * (ad + bc) + bd;
////    }
//
//    private static void computeTimeStandardMultiplication(int x, int y) {
//        System.out.println();
//        System.out.println("Standard:");
//        long startTime = System.currentTimeMillis();
//        System.out.println(startTime);
////        long total = 0;
//        long result = 0;
//        for (int i = 0; i < 10000000; i++) {
////            total += i;
//            result += x * y;
//        }
////        System.out.println(x * y);
//        System.out.println(result);
//        long stopTime = System.currentTimeMillis();
//        System.out.println(stopTime);
//        long elapsedTime = stopTime - startTime;
//        System.out.println(elapsedTime + " milliseconds");
//    }
//
//    private static void computeTimeKaratsubaMultiplication(int x, int y) {
//        System.out.println();
//        System.out.println("Karatsuba:");
//        long startTime = System.currentTimeMillis();
//        System.out.println(startTime);
////        long total = 0;
//        long result = 0;
//        for (int i = 0; i < 10000000; i++) {
////            total += i;
//            result += Math.pow(10, n) * ac + (int) Math.pow(10, n / 2) * (ad + bc) + bd;
//        }
////        System.out.println(multiply(x, y));
//        System.out.println(result);
//        long stopTime = System.currentTimeMillis();
//        System.out.println(stopTime);
//        long elapsedTime = stopTime - startTime;
//        System.out.println(elapsedTime + " milliseconds");
//    }
//    public static void main(String[] args) {
////        int x = 5678;
////        int y = 1234;
////        System.out.println("Are the results of the two multiplying methods the same? - " + (x * y == multiply(x, y)));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter x:");
//        x = scanner.nextInt();
//        System.out.println("Enter y:");
//        y = scanner.nextInt();
//        scanner.close();
//
//        int result = (int) Math.pow(10, n) * ac + (int) Math.pow(10, n / 2) * (ad + bc) + bd;
//        int result1 = x * y;
//        System.out.println(result);
//        System.out.println(result1);
//
////        computeTimeStandardMultiplication(x, y);
////        computeTimeKaratsubaMultiplication(x, y);
//
//
//
//    }
//}

//import java.util.Scanner;
//
//public class KaratsubaMain {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter x:");
//        int x = scanner.nextInt();
//        System.out.println("Enter y:");
//        int y = scanner.nextInt();
//        scanner.close();
//
//        String xString = x + "";
//        String yString = y + "";
//        int n = xString.length();
//        int a = Integer.parseInt(xString.substring(0, n / 2));
//        int b = Integer.parseInt(xString.substring(n / 2));
//        int c = Integer.parseInt(yString.substring(0, n / 2));
//        int d = Integer.parseInt(yString.substring(n / 2));
//        int ac = a * c;
//        int bd = b * d;
//        int ad = a * d;
//        int bc = b * c;
//
//        System.out.println();
//        System.out.println("Standard:");
//        long startTime = System.currentTimeMillis();
//        System.out.println(startTime);
////        long total = 0;
//        long result = 0;
//        for (int i = 0; i < 10000000; i++) {
////            total += i;
//            result += x * y;
//        }
////        System.out.println(x * y);
//        System.out.println(result);
//        long stopTime = System.currentTimeMillis();
//        System.out.println(stopTime);
//        long elapsedTime = stopTime - startTime;
//        System.out.println(elapsedTime + " milliseconds");
//
//        System.out.println();
//        System.out.println("Karatsuba:");
//        long startTime1 = System.currentTimeMillis();
//        System.out.println(startTime1);
////        long total = 0;
//        long result1 = 0;
//        for (int i = 0; i < 10000000; i++) {
////            total += i;
//            result1 += Math.pow(10, n) * ac + (int) Math.pow(10, n / 2) * (ad + bc) + bd;
//        }
////        System.out.println(multiply(x, y));
//        System.out.println(result1);
//        long stopTime1 = System.currentTimeMillis();
//        System.out.println(stopTime1);
//        long elapsedTime1 = stopTime1 - startTime1;
//        System.out.println(elapsedTime1 + " milliseconds");
//    }
//}
