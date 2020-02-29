package am.vtorosyan;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        System.out.println("Please input tre numbers and program will decide if the numbers order is increasing or decreasing");
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Input the first number : ");
        a = input.nextInt();
        System.out.print("Input the second number: ");
        b = input.nextInt();
        System.out.print("Input the third number : ");
        c = input.nextInt();
        if (a < b && b < c) {
            System.out.println("increasing");
        } else if (a > b && b > c) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
