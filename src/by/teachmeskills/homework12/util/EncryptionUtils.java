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

        char[] chars = source.toCharArray();
        String cipherString = "";
        for (int i = 0; i < chars.length; i++) {
            if (!((chars[i] > 'A' && chars[i] < 'Z'))) {
                int result = (char) ((Math.floorMod(chars[i] - 'A' + key, ENGLISH_ALPHABET)));
                chars[i] = (char) (result + 'A');
            } else {
                throw new IllegalArgumentException("Uncorrected symbols");
            }
        }
        cipherString = String.valueOf(chars);
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
    public static String encryptCezarCipher(String source, int key) {
        return shiftElementsByCezarCipher(source, key);
    }

    public static String decryptCezarCipher(String source, int key) {
        return shiftElementsByCezarCipher(source, -key);
    }

    public static String shiftElementsByCezarCipher(String source, int key) {

        char[] chars = source.toCharArray();
        String cipherString = "";
        for (int i = 0; i < chars.length; i++) {
            if (!(chars[i] > 'A' && chars[i] < 'Z')) {
                int result = (char) ((Math.floorMod(chars[i] - 'A' +
                        key, ENGLISH_ALPHABET)));
                chars[i] = (char) (result + 'A');
            } else {
                throw new IllegalArgumentException("Uncorrected symbols");
            }
        }
        cipherString = String.valueOf(chars);
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