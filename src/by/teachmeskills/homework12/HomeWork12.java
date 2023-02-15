package by.teachmeskills.homework12;

import by.teachmeskills.homework12.util.ArrayUtils;
import by.teachmeskills.homework12.util.EncryptionUtils;
import by.teachmeskills.homework12.util.UserInputUtils;

import java.util.Scanner;

public class HomeWork12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                    System.out.println("Enter the phrase to encrypt");
                    String phrase = EncryptionUtils.getPhrase();
                    System.out.println("Enter the key to shift ");
                    int key = EncryptionUtils.getKey();
                    System.out.println("The result is: ");
                    String result = EncryptionUtils.encryptWithCaesar(phrase, key);
                    System.out.println(result);

                }
                case 4 -> {
                    System.out.println("Enter the phrase to decrypt");
                    String phrase = EncryptionUtils.getPhrase();
                    System.out.println("Enter the key to shift ");
                    int key = EncryptionUtils.getKey();
                    System.out.println("The result is: ");
                    String result = EncryptionUtils.decryptWithCaesar(phrase, key);
                    System.out.println(result);

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