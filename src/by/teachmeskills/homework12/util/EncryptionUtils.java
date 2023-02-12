package by.teachmeskills.homework12.util;

public class EncryptionUtils {

    private static final int UPPERCASE_CHARACTER_RANGE = 26;
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
        source = source.toUpperCase();

        char[] sourceArr = source.toCharArray();

        for (int i = 0; i < source.length(); i++) {
            if (isUppercaseLatinLetter(source.charAt(i))) {
                sourceArr[i] = getEncryptLetter(source.charAt(i), key);
            } else
                sourceArr[i] = source.charAt(i);
        }

        return String.valueOf(sourceArr);
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
        source = source.toUpperCase();

        char[] sourceArr = source.toCharArray();

        for (int i = 0; i < source.length(); i++) {
            if (isUppercaseLatinLetter(source.charAt(i))) {
                sourceArr[i] = getDecryptLetter(source.charAt(i), key);
            } else sourceArr[i] = source.charAt(i);
        }

        return String.valueOf(sourceArr);
    }

    public static boolean isUppercaseLatinLetter(char letter) {
        return letter >= 'A' && letter <= 'Z';
    }

    public static char getDecryptLetter(char letter, int key) {
        int sourcePosition = 'Z' - letter;
        int newPosition = Math.abs((sourcePosition + key) % 26);
        return (char) ('Z' - newPosition);
    }

    public static char getEncryptLetter(char letter, int key) {
        int sourcePosition = letter - 'A';
        int newPosition = Math.abs((sourcePosition + key) % 26);
        return (char) ('A' + newPosition);
    }
}
