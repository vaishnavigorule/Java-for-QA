import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> testCases = new LinkedList<>();

        testCases.add("Login");
        testCases.add("Signup");
        testCases.add("Logout");

        testCases.addFirst("Registration");
        testCases.addLast("Forgot Password");

        System.out.println(testCases);

    }
}
