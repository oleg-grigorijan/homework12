package by.teachmeskills.homework12.util;

import java.util.Arrays;

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
        char [] result = source.toCharArray();
        for (int i = 0; i < source.length(); i++) {
            key=(char)key;
            result[i]+=key;
            if (result[i]>'Z') {
                result[i]= (char) ((result[i]-'A')%26+'A');
                System.out.println(25 % 26);
//                result[i]= (char) ('A'-1+key);
            }
        }

        source=String.copyValueOf(result);
        return source;
//        // TODO: Implement
//        throw new IllegalStateException("Not yet implemented");
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
        throw new IllegalStateException("Not yet implemented");
    }
}
