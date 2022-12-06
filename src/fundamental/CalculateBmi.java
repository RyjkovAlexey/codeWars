package fundamental;

public class CalculateBmi {
    public static String bmi(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);

        return bmi <= 18.5 ? "Underweight" : bmi <= 25.0 ? "Normal" : bmi <= 30.0 ? "Overweight" : bmi > 30 ? "Obese" : "";
    }

    public static void main(String[] args) {
        System.out.println(bmi(80,1.80));
    }
}
