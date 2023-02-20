package by.teachmeskills.homework12.util;

import javax.print.DocFlavor;
import java.security.Key;
import java.util.Arrays;

public class EncryptionUtils {
    public static final int ENGLISH_ALPHABET_LENGTH = 26;

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
        return calculateOffsetAlphabet(source, key);
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
        return calculateOffsetAlphabet(source, -key);
    }

    private static String calculateOffsetAlphabet(String source, int key) {
        char[] result = source.toCharArray();
        for (int i = 0; i < source.length(); i++) {
            int sourseIndexLetter = result[i] - 'A';
            int resultIndexLetter = Math.floorMod(sourseIndexLetter + key, ENGLISH_ALPHABET_LENGTH);
            result[i] = (char) (resultIndexLetter + 'A');
        }
        source = String.copyValueOf(result);
        return source;
    }
}
