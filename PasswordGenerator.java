package com.PswdGenerator.pack1;

import java.util.Random;


public class PasswordGenerator {
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{}|;:,.<>?";

    private int length;
    private boolean useLowercase;
    private boolean useUppercase;
    private boolean useSpecialChars;

    public PasswordGenerator(int length, boolean useLowercase, boolean useUppercase, boolean useSpecialChars) {
        this.length = length;
        this.useLowercase = useLowercase;
        this.useUppercase = useUppercase;
        this.useSpecialChars = useSpecialChars;
    }

    public String generatePassword() {
        StringBuilder validChars = new StringBuilder();
        if (useLowercase) {
            validChars.append(LOWERCASE_CHARS);
        }
        if (useUppercase) {
            validChars.append(UPPERCASE_CHARS);
        }
        if (useSpecialChars) {
            validChars.append(SPECIAL_CHARS);
        }

        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validChars.length());
            password.append(validChars.charAt(randomIndex));
        }
        return password.toString();
    }
}
