package am.vtorosyan;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers and program will decide if they have same sign");
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Input the first number : ");
        a = input.nextInt();
        System.out.print("Input the second number : ");
        b = input.nextInt();
        if (a < 0 && b < 0) {
            System.out.println("True");
        } else if (a > 0 && b > 0) {
            System.out.println("True");
        } else if (a == 0 && b == 0) {
            System.out.println("You enter 0, please try again ");
        } else {
            System.out.println("False");
        }
    }
}
