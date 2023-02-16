package by.teachmeskills.homework12.util;

public class ArrayUtils {

    public static int sumAll(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
