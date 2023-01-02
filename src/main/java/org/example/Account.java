package org.example;

import java.security.SecureRandom;
import java.util.Random;

public class Account {
    private User user;
    private Department department;

    private String email;
    private String alternateEmail;
    private String password;

    private int mailBoxCapacity;

    public Account(String firstName, String lastName, Department department) {
        this.user = new User(firstName, lastName);
        this.department = department;
        this.email = this.transformEmail();
        this.alternateEmail = this.email;
        this.password = generateRandomPassword();
        System.out.println("SUCCESSFULLY CREATED!");
        this.displayInfo();
    }

    public Account(User user, Department department) {
        this.user = user;
        this.department = department;
        this.email = this.transformEmail();
        this.alternateEmail = this.email;
        this.password = generateRandomPassword();
        System.out.println("SUCCESSFULLY CREATED!");
        this.displayInfo();
    }

    public void displayInfo() {
        System.out.println("Name: " + this.user +
                "\nEmail: " + this.email +
                "\nAlternate Email: " + this.alternateEmail +
                "\nMailbox Capacity: " + this.mailBoxCapacity + "mb" +
                "\nPassword: " + this.password);
    }

    private String transformEmail() {
        String firstName = this.user.getFirstName().replaceAll("\\s", "").toLowerCase();
        String lastName = this.user.getLastName().replaceAll("\\s", "").toLowerCase();
        String domain = this.getDepartment().equals("") ? "company.com" : ".company.com";

        return firstName + "." + lastName + "@" + this.getDepartment() + domain;
    }

    private String generateRandomPassword() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder builder = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();

        while (builder.length() < 8) {
            int index = secureRandom.nextInt(chars.length());
            builder.append(chars.charAt(index));
        }

        return builder.toString();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDepartment() {
        switch (this.department) {
            case SALES:
                return "sales";
            case DEVELOPMENT:
                return "development";
            case ACCOUNTING:
                return "accounting";
            default:
                return "";
        }
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public void setMailBoxCapacity(int mailBoxCapacity) {
        this.mailBoxCapacity = mailBoxCapacity;
    }


}
