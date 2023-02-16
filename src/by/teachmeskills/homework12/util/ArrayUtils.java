package by.teachmeskills.homework12.util;

public class ArrayUtils {

    public static int sumAll(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static double calcAverage(int... numbers) {
        return numbers.length == 0
                ? 0.0
                : (double) sumAll(numbers) / numbers.length;
    }

    public static double getMin(int... numbers) {
        int min = 0;
        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            i++;
        }
        return min;
    }
}
