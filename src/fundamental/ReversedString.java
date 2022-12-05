package fundamental;

public class ReversedString {
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("world"));
    }
}
