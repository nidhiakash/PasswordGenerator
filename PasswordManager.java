package com.PswdGenerator.pack1;

import java.util.Scanner;

public class PasswordManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();
        System.out.print("Use lowercase characters? (true/false): ");
        boolean useLowercase = scanner.nextBoolean();
        System.out.print("Use uppercase characters? (true/false): ");
        boolean useUppercase = scanner.nextBoolean();
        System.out.print("Use special characters? (true/false): ");
        boolean useSpecialChars = scanner.nextBoolean();

        PasswordGenerator passwordGenerator = new PasswordGenerator(length, useLowercase, useUppercase, useSpecialChars);
        String generatedPassword = passwordGenerator.generatePassword();

        System.out.println("Generated password: " + generatedPassword);
        scanner.nextLine(); // Consume newline left by nextBoolean

        System.out.print("Enter a password to check its strength: ");
        String userPassword = scanner.nextLine();
        // Add your strength checking logic here
        
        if (PasswordStrengthChecker.isStrong(userPassword)) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is weak.");
        }

        scanner.close();
    }
}


