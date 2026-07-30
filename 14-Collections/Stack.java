import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> pages = new Stack<>();

        pages.push("Login");
        pages.push("Home");
        pages.push("Profile");

        System.out.println(pages);

        System.out.println("Top Page: " + pages.peek());

        pages.pop();

        System.out.println(pages);

    }
}
