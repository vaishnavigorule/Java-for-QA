interface Demo {

    static void message() {

        System.out.println("Static Interface Method");

    }

}

public class InterfaceWithStaticMethod {

    public static void main(String[] args) {

        Demo.message();

    }

}
