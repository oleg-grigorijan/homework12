package by.teachmeskills.homework12.util;

public class EncryptionUtils {

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

    public static final int ENGLISH_ALPHABET_LENGTH = 26;
    public static String shiftCharsByAlphabet(String source, int key) {
        if (!isReliableToCoding(source)) {
            throw new IllegalArgumentException("String need to contain only upper-case english letters");
        }
        char[] chars = source.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int sourceAlphabetIndex = chars[i] - 'A';
            int resultAlphabetIndex = Math.floorMod(sourceAlphabetIndex + key, ENGLISH_ALPHABET_LENGTH);
            chars[i] = (char) (resultAlphabetIndex + 'A');
        }
        return String.valueOf(chars);
    }

    public static boolean isReliableToCoding(String source) {
        for (int i = 0; i < source.length(); i++) {
            if (!(source.charAt(i) >= 'A' || source.charAt(i) <= 'Z')) {
                return false;
            }
        }
        return true;
    }
}