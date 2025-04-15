package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String input = scanner.nextLine();

        String[] nameParts = input.split("[ ,-]"); // split by (space)(,)(-)
        
        String firstName;
        String middleName = "";
        String lastName;
        String suffix = "";

        if (nameParts.length == 2) {
            firstName = nameParts[0];
            lastName = nameParts[1];
        } else if (nameParts.length == 3) {
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];
        } else if (nameParts.length == 4) {
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];
            suffix = nameParts[3];


        } else {
            System.out.println("Invalid input.enter either 'first last' or 'first middle last'.");
            return;
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
        System.out.println("Suffix: " + suffix);
    }
}