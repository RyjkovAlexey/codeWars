package fundamental;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aAeEiIoOuU]","");
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }
}
