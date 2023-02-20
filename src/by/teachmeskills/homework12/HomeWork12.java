package by.teachmeskills.homework12;

import by.teachmeskills.homework12.util.ArrayUtils;
import by.teachmeskills.homework12.util.EncryptionUtils;
import by.teachmeskills.homework12.util.UserInputUtils;

import java.util.Scanner;

public class HomeWork12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String source = null;
        int key = 0;
        System.out.println(
                """
                        Choose task:
                        1. Sum
                        2. Average
                        3. Caesar cipher encryption
                        4. Caesar cipher decryption
                        0. Exit"""
        );
        while (true) {
            System.out.println("Task number: ");
            int taskNumber = scanner.nextInt();
            switch (taskNumber) {
                case 1 -> {
                    int[] numbers = UserInputUtils.requestArray();
                    double sum = ArrayUtils.sumAll(numbers);
                    System.out.println("Sum: " + sum);
                }
                case 2 -> {
                    int[] numbers = UserInputUtils.requestArray();
                    double avg = ArrayUtils.calcAverage(numbers);
                    System.out.println("Average: " + avg);
                }
                case 3 -> {
                    source = UserInputUtils.requestString();
                    key = UserInputUtils.requestKey();
                    source = EncryptionUtils.encryptWithCaesar(source, key);
                    System.out.println("Encryption string: " + source);
                }
                case 4 -> {
                    if (source == null) {
                        throw new IllegalStateException("Decryption is not possible because " +
                                "the value for encryption is not set");
                    }
                    System.out.println("Decryption string: " + EncryptionUtils.decryptWithCaesar(source, key));
                    source = null;
                }
                case 0 -> {
                    return;
                }
                default -> System.err.println("Task doesn't exist");
            }
            System.out.println();
        }
    }
}