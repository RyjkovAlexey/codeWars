package fundamental;

public class GrasshopperSummation {
    public static int summation(int n) {
        int sum = 0;
        for (int i = n; i > 0; i--) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(summation(8));
    }
}
