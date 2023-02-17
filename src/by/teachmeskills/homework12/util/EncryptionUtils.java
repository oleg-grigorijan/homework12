package by.teachmeskills.homework12.util;

import java.util.Scanner;

public class EncryptionUtils {
    final static int ENGLISH_ALPHABET = 26;

    /**
     * Encrypts given string with a Caesar cipher
     *
     * @param source String to be encrypted made of upper-case english letters only
     * @param key    Secret value which means number of positions to shift the alphabet
     * @return Encrypted string
     * @throws IllegalArgumentException If source string contains unsupported characters
     * @see <a href="https://en.wikipedia.org/wiki/Caesar_cipher">Caesar Chipher</a>
     */
    public static String encryptWithCaesar(String source, int key) {
        final char LETTER_A = 'A';
        char[] chars = source.toCharArray();
        String cipherString = "";
        for (int i = 0; i < chars.length; i++) {
            if (!((i > 'A' && i < 'Z'))) {
                chars[i] = (char) (((int) source.charAt(i) - LETTER_A + key) % ENGLISH_ALPHABET + LETTER_A);
                cipherString = String.valueOf(chars);
            } else {
                throw new IllegalArgumentException("Uncorrected symbols");
            }
        }
        return cipherString;
    }


    /**
     * Decrypts given string with a Caesar cipher
     *
     * @param source String to be decrypted made of upper-case english letters only
     * @param key    Secret value which means number of positions to shift the alphabet
     * @return Decrypted string
     * @throws IllegalArgumentException If source string contains unsupported characters
     * @see <a href="https://en.wikipedia.org/wiki/Caesar_cipher">Caesar Chipher</a>
     */
    public static String decryptWithCaesar(String source, int key) {

        final char LETTER_Z = 'Z';
        char[] chars = source.toCharArray();
        String cipherString = "";
        for (int i = 0; i < chars.length; i++) {
            if ((Character.isUpperCase(chars[i]) && Character.isLetter(chars[i])) && !((i > 'A' && i < 'Z'))) {
                chars[i] = (char) (((int) source.charAt(i) - LETTER_Z - key) % ENGLISH_ALPHABET + LETTER_Z);
                cipherString = String.valueOf(chars);
            } else {
                throw new IllegalArgumentException("Uncorrected symbols");
            }
        }
        return cipherString;

    }

    public static String getPhrase() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static int getKey() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}