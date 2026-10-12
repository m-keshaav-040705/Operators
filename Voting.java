package operators;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Are you an Indian citizen? (true/false): ");
        boolean citizen = sc.nextBoolean();

        if (age >= 18 && citizen == true) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        sc.close();
    }
}