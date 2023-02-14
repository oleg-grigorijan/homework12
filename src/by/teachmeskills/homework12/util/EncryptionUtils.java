package by.teachmeskills.homework12.util;

public class EncryptionUtils {
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
    public static String decryptWithCaesar(String source, int key) {
        return encryptWithCaesar(source, ENGLISH_ALPHABET.length() - (key % ENGLISH_ALPHABET.length()));
    }

    public static boolean isLatinAndUpper(char inputChar) {
        return Character.isUpperCase(inputChar) && ((inputChar >= 'A' && inputChar <= 'Z'));
    }


}
