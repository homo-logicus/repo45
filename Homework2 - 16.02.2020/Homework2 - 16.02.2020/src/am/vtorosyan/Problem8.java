package am.vtorosyan;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        System.out.print("Please enter your mark : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a < 25) {
            System.out.println("Your grade : F");
        } else if (a >= 25 && a <45) {
            System.out.println("Your grade : E");
        } else if (a >= 45 && a < 50) {
            System.out.println("Your grade : D");
        } else if (a >= 50 && a < 60) {
            System.out.println("Your grade : C");
        } else if (a >= 60 && a < 80) {
            System.out.println("Your grade : B");
        } else {
            System.out.println("Your grade : A");
        }
    }
}
