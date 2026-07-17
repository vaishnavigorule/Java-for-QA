public class ConstructorChaining {

    ConstructorChaining() {

        this("Java");

        System.out.println("Default");

    }

    ConstructorChaining(String name) {

        System.out.println(name);

    }

    public static void main(String[] args) {

        new ConstructorChaining();

    }

}
