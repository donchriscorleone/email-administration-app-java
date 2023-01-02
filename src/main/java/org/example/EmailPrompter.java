package org.example;

import java.util.Scanner;

public class EmailPrompter {
    private Scanner scanner;

    public EmailPrompter() {
        this.scanner = new Scanner(System.in);
    }

    public String enterFirstName() {
        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();
        return firstName;
    }

    public String enterLastName() {
        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();
        return lastName;
    }

    public Department enterDeparment() {
        System.out.println("Please enter your department by code");
        System.out.println("1 for Sales\n2 for Development\n3 for Accounting\n4 for None");
        int dept = scanner.nextInt();
        scanner.nextLine();
        switch (dept) {
            case 1:
                return Department.SALES;
            case 2:
                return Department.DEVELOPMENT;
            case 3:
                return Department.ACCOUNTING;
            default:
                return Department.NONE;
        }
    }

    public String enterAltEmail() {
        System.out.println("Please enter your alternate email: ");
        String altEmail = scanner.nextLine();
        return altEmail;
    }

    public int enterMailBoxCapacity() {
        System.out.println("Enter your desired mailbox capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();
        return capacity;
    }

    public String enterPassword() {
        System.out.println("Please enter your new password: ");
        String newPassword = scanner.nextLine();
        return newPassword;
    }

    public int enterCode() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
