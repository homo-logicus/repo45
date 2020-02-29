package am.vtorosyan;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Please enter four int type numbers and program will find if they are equal to each other or not");
        System.out.print("Please enter first number - ");
        a = input.nextInt();
        System.out.print("Please enter second number - ");
        b = input.nextInt();
        System.out.print("Please enter third number -");
        c = input.nextInt();
        System.out.print("Please enter fourth number - ");
        d = input.nextInt();
        if (a == b && b == c && c == d) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

    }
}
