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
                        2. Caesar cipher encryption
                        3. Caesar cipher decryption           
                        4. Average
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
                    System.out.println("Enter string (uppercase latin characters): ");
                    String str = scanner.next();
                    System.out.print("Enter key: ");
                    int key = scanner.nextInt();
                    String decryptString = EncryptionUtils.encryptWithCaesar(str, key);
                    System.out.println("Your decryption string: " + decryptString);
                }
                case 3 -> {
                    System.out.println("Enter decryption string (uppercase latin characters): ");
                    String decryptStr = scanner.next();
                    System.out.print("Enter key: ");
                    int key = scanner.nextInt();
                    String encryptString = EncryptionUtils.decryptWithCaesar(decryptStr, key);
                    System.out.println("Your encryption string: " + encryptString);
                }
                case 4 -> {
                    int[] numbers = UserInputUtils.requestArray();
                    double avg = ArrayUtils.calcAverage(numbers);
                    System.out.println("Average: " + avg);
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