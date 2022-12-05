package fundamental;

public class YouOnlyNeedOneBeginner {

    public static boolean check(Object[] a, Object x) {
        for (Object o : a) {
            if (o.equals(x)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(check(new Object[]{80, 117, 115, 104, 45, 85, 112, 115},45));
    }
}
