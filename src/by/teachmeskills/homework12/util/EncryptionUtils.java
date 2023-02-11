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

        if (!isGoodForCoding(source)) {
            throw new IllegalArgumentException("String contains unsupported characters");
        }

        String encryptedString = "";
        char currentCharacter;

        for (int i = 0; i < source.length(); ++i) {
            currentCharacter = source.charAt(i);

            if (!Character.isWhitespace(currentCharacter)) {

                currentCharacter = (char) (currentCharacter + key);

                if (currentCharacter > 'Z') {
                    currentCharacter = (char) (currentCharacter - 'Z' + 'A' - 1);
                }
            }
            encryptedString += currentCharacter;
        }
        return encryptedString;
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

        if (!isGoodForCoding(source)) {
            throw new IllegalArgumentException("String contains unsupported characters");
        }

        String decryptedString = "";
        char currentCharacter;

        for (int i = 0; i < source.length(); i++) {
            currentCharacter = source.charAt(i);

            if (!Character.isWhitespace(currentCharacter)) {
                currentCharacter = (char) (currentCharacter - key);

                if (currentCharacter < 'A') {
                    currentCharacter = (char) (currentCharacter + 'Z' - 'A' + 1);
                }
            }
            decryptedString += currentCharacter;
        }
        return decryptedString;
    }

    private static boolean isGoodForCoding(String source) {

        char[] inputString = source.toCharArray();
        for (char c : inputString) {
            if ((c < 'A' || c > 'Z') && (!Character.isWhitespace(c))) {
                return false;
            }
        }
        return true;
    }
}