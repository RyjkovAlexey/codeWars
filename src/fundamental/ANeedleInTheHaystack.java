package fundamental;

public class ANeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") return String.format("found the needle at position %d", i);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(findNeedle(new Object[]{"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false}));
    }
}
