package by.teachmeskills.homework12.util;

public class EncryptionUtils {

    private static final int ENGLISH_ALPHABET_LENGTH = 26;
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
        return shiftCharsByAlphabet(source, key);
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
       return shiftCharsByAlphabet(source, -key);
    }

    public static boolean isUppercaseLatinLetter(char letter) {
        return letter >= 'A' && letter <= 'Z';
    }

    private static String shiftCharsByAlphabet(String source, int key) {
        source = source.toUpperCase();
        char[] sourceArr = source.toCharArray();

        for (int i = 0; i < source.length(); i++) {
            if (isUppercaseLatinLetter(source.charAt(i))) {
                int sourcePosition = sourceArr[i] - 'A';
                int newPosition = Math.floorMod(sourcePosition + key, ENGLISH_ALPHABET_LENGTH);
                sourceArr[i] = (char) (newPosition + 'A');
            } else sourceArr[i] = source.charAt(i);
        }
        return new String(sourceArr);
    }
}
