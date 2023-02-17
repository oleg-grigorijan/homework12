package by.teachmeskills.homework12.util;

import java.util.Scanner;

public class UserInputUtils {

    public static int[] requestArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array length:");
        int length = scanner.nextInt();
        if (length < 0) {
            throw new IllegalArgumentException("Array size must be 0 or greater");
        }

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Element " + i + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static String requestString() {
        System.out.println("String for encryption: ");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        if (tmp.isBlank()) {
            throw new IllegalStateException("Line is empty");
        }

        for (int i = 0; i < tmp.length(); i++) {
            if (!(tmp.charAt(i) >= 'A' && tmp.charAt(i) <= 'Z') && tmp.charAt(i) != ' ') {
                //TODO: Implement
                throw new IllegalStateException("Incorrect line was entered");
            }
        }
        return tmp;
    }

    public static int requestKey() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Key for encryption: ");
        if (!scanner.hasNextInt()) {
            throw new IllegalStateException("The key is not a number");
        }
        return scanner.nextInt();
    }
}
