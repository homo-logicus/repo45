package am.vtorosyan;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println("This program will check if you insert even number");
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Please enter the number - ");
        a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println("True\nEntered number is even");
        } else {
            System.out.println("False\nEntered number is odd");
        }
    }
}
