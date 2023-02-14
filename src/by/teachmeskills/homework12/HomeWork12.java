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
                        2. Caesar cipher encryption
                        3. Caesar cipher decryption
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
                    System.out.println("Enter a string to encode: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String userStr = scanner1.nextLine();
                    System.out.println("Enter KEY to encode: ");
                    int userKey = scanner1.nextInt();
                    System.out.println(EncryptionUtils.encryptWithCaesar(userStr, userKey));
                }
                case 4 -> {
                    System.out.println("Enter a string to decode: ");
                    Scanner scanner2 = new Scanner(System.in);
                    String userStr = scanner2.nextLine();
                    System.out.println("Enter KEY to decode: ");
                    int userKey = scanner2.nextInt();
                    System.out.println(EncryptionUtils.decryptWithCaesar(userStr, userKey));
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