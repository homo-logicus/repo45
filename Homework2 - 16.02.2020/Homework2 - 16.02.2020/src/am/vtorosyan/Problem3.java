package am.vtorosyan;

import java.util.Locale;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println("This program will check if you entered the number with floating point between 0 and 1");
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double a, b;
        System.out.print("Please enter first number - ");
        a = input.nextDouble();
        System.out.print("Please enter second number - ");
        b = input.nextDouble();
        if (a > 0 && a < 1 && b > 0 && b < 1){
            System.out.println("True\nThe numbers that you inserted are between 0 and 1");
        } else {
            System.out.println("False\nThe numbers that you inserted are not between 0 and 1");
        }


    }
}
