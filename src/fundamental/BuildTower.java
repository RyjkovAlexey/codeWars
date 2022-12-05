package fundamental;

public class BuildTower {
    public static String[] towerBuilder(int nFloors) {
        String[] result = new String[nFloors];

        for (int i = 1; i <= nFloors; i++) {
            String space = " ".repeat(nFloors - i);
            String star = "*".repeat((2 * i) - 1);
            result[i - 1] = space + star + space;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
