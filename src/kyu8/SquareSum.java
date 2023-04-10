package kyu8;

import java.util.Arrays;

public class SquareSum {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).reduce(0,(subtotal, element)-> subtotal + element * element);
    }

    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{1,2,2}));
    }
}
