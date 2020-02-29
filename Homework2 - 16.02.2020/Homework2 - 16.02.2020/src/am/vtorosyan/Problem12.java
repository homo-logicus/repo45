package am.vtorosyan;

import java.util.Locale;
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        System.out.println("Welcome to my first simple calculator program");
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        ;
        double a, b;
        char c;
        System.out.print("Input the first number : ");
        a = input.nextDouble();
        System.out.print("Input the second number : ");
        b = input.nextDouble();
        System.out.print("Input the operator : ");
        c = input.next().charAt(0);
        if (c == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (c == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (c == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (c == '/') {
            if (b != 0.0) {
                System.out.println(a + " / " + b + " = " + (a / b));
            } else {
                System.out.println("Can't divide by zero");
            }
        } else {
            System.out.println("Please enter the valid operator (+ , - , * , /)");
        }

    }
}
