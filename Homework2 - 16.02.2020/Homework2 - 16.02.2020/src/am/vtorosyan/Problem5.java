package am.vtorosyan;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println("Please input tre int type numbers.\nThe program will calculate the sum of first two numbers and compare if the sum is equal to thIrd number or not.");
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Input the first number : ");
        a = input.nextInt();
        System.out.print("Input the second number: ");
        b = input.nextInt();
        System.out.print("Input the third number : ");
        c = input.nextInt();
        if (a+b == c) {
            System.out.println("The result is: true");
        } else {
            System.out.println("The result is: false");
        }
    }

}
