import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<String> tools = new ArrayList<>();

        tools.add("Selenium");
        tools.add("Java");
        tools.add("SQL");

        Iterator<String> iterator = tools.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

    }
}
