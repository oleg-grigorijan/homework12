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
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Введите данные для шифрования: ");
                    String encrypt = scan.nextLine();
                    System.out.println("Введите ключ для расшифрования");
                    int key = scan.nextInt();
                    System.out.println(EncryptionUtils.encryptWithCaesar(encrypt, key));
                }
                case 3 -> {
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Введите данные для расшифрования: ");
                    String decrypt = scan.nextLine();
                    System.out.println("Введите ключ для расшифрования");
                    int key = scan.nextInt();
                    System.out.println(EncryptionUtils.decryptWithCaesar(decrypt,key));
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