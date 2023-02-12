package by.teachmeskills.homework12.util;

public class EncryptionUtils {
public static final int NUM_OF_LATIN_LETTERS=26;
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
        // TODO: Implement

        char[] chars = source.toCharArray();
        for (int i = 0; i < source.length(); i++) {
            if (chars[i] < 'X' && chars[i] > 'A') {
                chars[i] = (char) (chars[i] + key);
            } else if (chars[i] > 'W' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] - NUM_OF_LATIN_LETTERS + key);
            }
else if(chars[i]>'Z'||chars[i]<'A'){
    throw new IllegalStateException("Enter correct line which consists of capital letters");
            }
        }
        source = String.valueOf(chars);
        return source;
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
        // TODO: Implement
        char[] chars = source.toCharArray();
        for (int i = 0; i < source.length(); i++) {
            if (chars[i] < 'X' && chars[i] > 'A') {
                chars[i] = (char) (chars[i] + key);
            } else if (chars[i] > 'W' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + NUM_OF_LATIN_LETTERS - key);
            }
            else if(chars[i]>'Z'||chars[i]<'A'){
                throw new IllegalStateException("Enter correct line which consists of capital letters");
            }
        }
        source = String.valueOf(chars);
        return source;
    }
}
