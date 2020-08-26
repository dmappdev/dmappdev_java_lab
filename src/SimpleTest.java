public class SimpleTest {


    public static void main(String[] args) {
        System.out.println(isGreaterThan("b", "a"));
    }
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


}
