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
    public static final String ENGLISH_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String encryptWithCaesar(String source, int key) {
        char[] sourceArr = source.toCharArray();

        for (char ch : sourceArr) {
            if (!isLatinAndUpper(ch)) {
                throw new IllegalArgumentException("If source string contains unsupported characters");
            }
        }
        String resultCaesar = "";
        for (char ch : sourceArr) {
            if (ENGLISH_ALPHABET.indexOf(ch) != -1) {
                ch = ENGLISH_ALPHABET.charAt((ENGLISH_ALPHABET.indexOf(ch) + key) % ENGLISH_ALPHABET.length());
                resultCaesar += ch;

            }
        }
        return resultCaesar;
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
        return encryptWithCaesar(source, ENGLISH_ALPHABET.length() - (key % ENGLISH_ALPHABET.length()));
    }

    public static boolean isLatinAndUpper(char inputChar) {
        return Character.isUpperCase(inputChar) && ((inputChar >= 'A' && inputChar <= 'Z'));
    }


}
