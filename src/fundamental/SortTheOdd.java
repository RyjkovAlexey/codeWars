package fundamental;

import java.util.ArrayList;
import java.util.Arrays;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        ArrayList<Integer> oddIndexes = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) oddIndexes.add(i);
        }

        if (oddIndexes.size() > 1) {
            for (Integer oddIndex1 : oddIndexes) {
                for (Integer oddIndex2 : oddIndexes) {
                    if (array[oddIndex1] < array[oddIndex2]){
                        int temp = array[oddIndex1];
                        array[oddIndex1] = array[oddIndex2];
                        array[oddIndex2] = temp;
                    }
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{5, 3, 2, 8, 1, 4})));
    }
}
