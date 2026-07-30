import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> browsers = new ArrayList<>();

        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");

        System.out.println(browsers);

        System.out.println(browsers.get(0));

        browsers.remove("Edge");

        System.out.println(browsers);

    }
}
