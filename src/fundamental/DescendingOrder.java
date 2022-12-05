package fundamental;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        return Integer.parseInt(
                Arrays.stream(String.valueOf(num).split(""))
                        .sorted((el1, el2) -> el2.compareTo(el1))
                        .collect(Collectors.joining(""))
        );
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(0));
    }
}
