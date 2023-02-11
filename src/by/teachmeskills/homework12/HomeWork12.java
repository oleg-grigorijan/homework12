package by.teachmeskills.homework12;

import by.teachmeskills.homework12.util.ArrayUtils;
import by.teachmeskills.homework12.util.UserInputUtils;

import java.util.Scanner;

import static by.teachmeskills.homework12.util.EncryptionUtils.decryptWithCaesar;
import static by.teachmeskills.homework12.util.EncryptionUtils.encryptWithCaesar;

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
                    Scanner caseScaner = new Scanner(System.in);
                    System.out.print("Input string for encrypt: ");
                    String stringForEncoding = caseScaner.nextLine();
                    System.out.print("Input key for encrypt: ");
                    int key = caseScaner.nextInt();
                    System.out.print("Encrypted string is: " + encryptWithCaesar(stringForEncoding, key));
                }
                case 4 -> {
                    Scanner caseScaner = new Scanner(System.in);
                    System.out.print("Input string for decrypt: ");
                    String stringForEncoding = caseScaner.nextLine();
                    System.out.print("Input key for decrypt: ");
                    int key = caseScaner.nextInt();
                    System.out.print("Decrypted string is: " + decryptWithCaesar(stringForEncoding, key));
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