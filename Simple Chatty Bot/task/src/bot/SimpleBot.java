package bot;

import java.util.Scanner;

public class SimpleBot {
    static Scanner scanner = new Scanner(System.in);
    private static final String assistantName = "Aid";
    private static final String birthYear = "2021";

    public static void main(String[] args) {
        greet();
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet() {
        System.out.printf("Hello! My name is %s.\nI was created in %s.\n" +
                "Please, remind me your name.\n", assistantName, birthYear);
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.printf("What a great name you have, %s!\n", name);
    }

    static void guessAge() {
        int rem3, rem5, rem7;
        System.out.println("Let me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7.");
        rem3 = scanner.nextInt();
        rem5 = scanner.nextInt();
        rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.printf("Your age is %d that's a good time to start programming!\n", age);
    }

    static void count() {
        int num;
        System.out.println("Now I will prove to you that I can count to any number you want.");
        num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        int answer;
        System.out.println("Let's test your programming knowledge.\n" +
                "Why do we use methods?\n." +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program.");
        answer = scanner.nextInt();
        if (answer != 2) {
            System.out.println("Please, try again.");
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
