package am.vtorosyan;

import java.util.Scanner;

public class Problem11SingleAssignment {
    public static void main(String[] args) {
        System.out.println("Please enter the true or false statement for following variables");
        boolean doesSignificantWork, makesBreakthrough, nobelPrizeCandidate;
        Scanner input = new Scanner(System.in);
        System.out.print("doesSignificantWork: ");
        doesSignificantWork = input.nextBoolean();
        System.out.print("makesBreakthrough: ");
        makesBreakthrough = input.nextBoolean();
        nobelPrizeCandidate = (doesSignificantWork && makesBreakthrough);
        System.out.print(nobelPrizeCandidate);

    }
}
