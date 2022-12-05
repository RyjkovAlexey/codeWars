package fundamental;

public class CenturyFromYear {
    public static int century(int number) {
        int century = 0;
        while (number > 100) {
            number -= 100;
            System.out.println(number);
            century++;
        }
        if (number > 0) century++;

        return century;
    }

    public static void main(String[] args) {
        System.out.println(century(1705));
    }
}
