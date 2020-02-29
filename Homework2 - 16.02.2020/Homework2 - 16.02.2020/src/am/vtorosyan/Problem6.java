package am.vtorosyan;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        System.out.println("The program will convert the seconds to hour, minute and seconds");
        Scanner input = new Scanner(System.in);
        int secIn;
        System.out.print("Input seconds: ");
        secIn = input.nextInt();
        int h = secIn / 3600;
        int m = (secIn % 3600) / 60;
        int s = secIn % 60;
        System.out.println(h + ":" + m + ":" + s);

    }
}
