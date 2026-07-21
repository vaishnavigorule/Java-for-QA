interface Test {

    default void display() {

        System.out.println("Default Method");

    }

}

public class InterfaceWithDefaultMethod implements Test {

    public static void main(String[] args) {

        InterfaceWithDefaultMethod obj = new InterfaceWithDefaultMethod();

        obj.display();

    }

}
