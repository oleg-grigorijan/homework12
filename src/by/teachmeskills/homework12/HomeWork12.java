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
                    Scanner sc = new Scanner(System.in);
                    System.out.print("String for encrypt: ");
                    String str = sc.nextLine();
                    System.out.print("Key for encrypt: ");
                    int key = sc.nextInt();
                    System.out.println("Encrypted string is: " +
                            EncryptionUtils.encryptWithCaesar(str, key));
                }
                case 4 -> {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("String for decrypt: ");
                    String str = sc.nextLine();
                    System.out.print("Key for decrypt: ");
                    int key = sc.nextInt();
                    System.out.println("Decrypted string is: " +
                            EncryptionUtils.decryptWithCaesar(str, key));
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