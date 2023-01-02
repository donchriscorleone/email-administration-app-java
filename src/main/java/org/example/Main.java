package org.example;

public class Main {
    public static void main(String[] args) {
        EmailPrompter emailPrompter = new EmailPrompter();
        System.out.println("Welcome to Email Administration App!");
        System.out.println("To setup your account, please input the following on the prompter.");

        String firstName = emailPrompter.enterFirstName();
        String lastName = emailPrompter.enterLastName();
        Department department = emailPrompter.enterDeparment();

        Account account = new Account(firstName, lastName, department);

        System.out.println("------------------------------");
        System.out.println("To change your email settings, please input the following: ");
        while (true) {
            System.out.println("------------------------------");
            System.out.println("1 for changing your password" +
                    "\n2 for changing your mailbox capacity" +
                    "\n3 for changing your alternate email" +
                    "\n4 for displaying your current email setting" +
                    "\n5 to quit the prompt");

            int code = emailPrompter.enterCode();
            switch (code) {
                case 1:
                    account.setPassword(emailPrompter.enterPassword());
                    break;
                case 2:
                    account.setMailBoxCapacity(emailPrompter.enterMailBoxCapacity());
                    break;
                case 3:
                    account.setAlternateEmail(emailPrompter.enterAltEmail());
                    break;
                case 4:
                    account.displayInfo();
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }
    }
}