import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> testCases = new LinkedHashMap<>();

        testCases.put(101, "Login Test");
        testCases.put(102, "Signup Test");
        testCases.put(103, "Logout Test");

        System.out.println(testCases);

    }
}
