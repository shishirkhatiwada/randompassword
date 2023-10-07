import java.security.SecureRandom;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        int passwordLength = 12; // Change the length as per your requirements
        String generatedPassword = generateRandomPassword(passwordLength);
        System.out.println("Generated Password: " + generatedPassword);
    }

    public static String generateRandomPassword(int length) {
        // Define the characters that can be used in the password
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String digitChars = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?";

        // Combine all the character sets
        String allChars = uppercaseChars + lowercaseChars + digitChars + specialChars;

        // Create a SecureRandom object to generate random numbers securely
        SecureRandom random = new SecureRandom();

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(allChars.length());
            char randomChar = allChars.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
    }
}
