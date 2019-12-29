package ThirthyDayChallenge.day04_ClassInsance;

import java.util.Scanner;

// https://www.hackerrank.com/challenges/30-class-vs-instance/problem
public class Person {

    private int age;

    public void yearPasses() {
        this.age++;
    }

    public void amIOld() {
        if (this.age < 13) {
            System.out.println("You are young.");
        } else if (/*this.age >= 13 && */this.age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public Person(int initialAge) {
        if (initialAge > 0) {
            this.age = initialAge;
        } else {
            setAge(0);
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
/*Sample Input

4
-1
10
16
18
Sample Output

Age is not valid, setting age to 0.
You are young.
You are young.

You are young.
You are a teenager.

You are a teenager.
You are old.

You are old.
You are old.*/
