import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> browsers = new HashSet<>();

        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Chrome");
        browsers.add("Edge");

        System.out.println(browsers);

    }
}
