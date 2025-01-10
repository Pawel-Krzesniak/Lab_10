package exercise5;

import java.util.Scanner;

public class UserInput {

    public static String requestDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first three digits of the account number:");
        return scanner.nextLine().trim();
    }
}

