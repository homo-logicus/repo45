package am.vtorosyan;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        System.out.println("Please enter the age of 3 peoples and program will filter the oldest and youngest of them");
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Please enter the age of First man: ");
        a = input.nextInt();
        System.out.print("Please enter the age of Second man: ");
        b = input.nextInt();
        System.out.print("Please enter the age of Third man: ");
        c = input.nextInt();
        if (a > b && a > c) {
            System.out.println("The Oldest are First man");
        } else if (b > a && b > c) {
            System.out.println("The Oldest are Second man");
        } else if (c > a && c > b) {
            System.out.println("The Oldest are Third man");
        }
        if (a < b && a < c){
            System.out.println("The Youngest are First man");
        } else if (b < a && b < c) {
            System.out.println("The Youngest are Second man");
        } else if (c < a && c < b) {
            System.out.println("The Youngest are Third man");
        }


    }
}
