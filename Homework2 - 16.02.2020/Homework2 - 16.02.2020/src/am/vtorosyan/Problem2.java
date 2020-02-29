package am.vtorosyan;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Please enter the number and program will figure out if that number is positive or negative - ");
        a = input.nextInt();
        if (a > 0) {
            System.out.println("Number is positive");
        } else if (a < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("You enter the 0");
        }
    }
}
