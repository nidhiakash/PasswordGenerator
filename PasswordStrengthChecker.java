package com.PswdGenerator.pack1;

public class PasswordStrengthChecker {
    public static boolean isStrong(String password) {
        // Define your strength criteria here
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialChars = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (isSpecialChar(c)) {
                hasSpecialChars = true;
            }
        }

        return hasUppercase && hasLowercase && hasSpecialChars && password.length() >= 8;
    }

    private static boolean isSpecialChar(char c) {
        String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?";
        return specialChars.contains(Character.toString(c));
    }
}