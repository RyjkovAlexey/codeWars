package fundamental;

import java.util.Arrays;

public class YourOrderPlease {

    public static String order(String words) {
        String[] splited = words.split(" ");
        String[] resultArr = new String[splited.length];
        Arrays.fill(resultArr, "");

        for (String s : splited) {
            for (int j = 0; j < s.length(); j++) {
                if (Character.isDigit(s.charAt(j))) {
                    int digit = Integer.parseInt(String.valueOf(s.charAt(j)));
                    resultArr[digit - 1] = s;
                }
            }
        }

        return String.join(" ", resultArr);
    }

    public static void main(String[] args) {
        System.out.println(order(""));
    }
}
