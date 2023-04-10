package kyu7;

public class RegexValidatePINCode {
    public static boolean validatePin(String pin) {
        if (pin.length() == 4 || pin.length() == 6) {
            return pin.matches("\\d+");
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
    }
}
