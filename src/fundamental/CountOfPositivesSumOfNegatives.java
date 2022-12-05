package fundamental;

import java.util.Arrays;

public class CountOfPositivesSumOfNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        int countPositive = 0;
        int sumNegative = 0;

        for (int i : input) {
            if (i < 0) sumNegative += i;
            if (i > 0) countPositive++;
        }

        return new int[]{countPositive, sumNegative};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
    }
}
