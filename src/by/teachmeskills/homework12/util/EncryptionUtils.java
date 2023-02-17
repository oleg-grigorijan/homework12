package by.teachmeskills.homework12.util;

public class EncryptionUtils {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

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
        int sumALPHABET = 26;
        source = source.toLowerCase();
        String encryptStr = "";

        for (int i = 0; i < source.length(); i++)
        {
            int pos = ALPHABET.indexOf(source.charAt(i));

            int encryptPos = (key + pos) % sumALPHABET;
            char encryptChar = ALPHABET.charAt(encryptPos);

            encryptStr += encryptChar;
        }

        return encryptStr;
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
        source = source.toLowerCase();

        // decryptStr to store decrypted data
        String decryptStr = "";

        // use for loop for traversing each character of the input string
        for (int i = 0; i < source.length(); i++)
        {
            int pos = ALPHABET.indexOf(source.charAt(i));
            int decryptPos = (pos - key) % 26;

            // if decryptPos is negative
            if (decryptPos < 0){
                decryptPos = ALPHABET.length() + decryptPos;
            }
            char decryptChar = ALPHABET.charAt(decryptPos);

            // add decrypted char to decrypted string
            decryptStr += decryptChar;
        }
        // return decrypted string
        return decryptStr;
    }
}
