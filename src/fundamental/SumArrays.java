package fundamental;

import java.util.Arrays;

public class SumArrays {
    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }

    public static void main(String[] args) {
        System.out.println(sum(new double[]{1, 5.2, 4, 0, -1}));
    }
}
