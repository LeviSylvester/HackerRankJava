package ThirthyDayChallenge.day13_AbstractClasses;

import java.util.*;

// https://www.hackerrank.com/challenges/30-abstract-classes/problem
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
/* Sample Input
The following input from stdin is handled by the locked stub code in your editor:
The Alchemist
Paulo Coelho
248

Sample Output
The following output is printed by your display() method:
Title: The Alchemist
Author: Paulo Coelho
Price: 248 */