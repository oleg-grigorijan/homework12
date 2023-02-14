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
}