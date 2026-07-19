class Parent {

    void display() {
        System.out.println("Parent Class");
    }

}

class Child extends Parent {

    @Override
    void display() {
        System.out.println("Child Class");
    }

}

public class MethodOverriding {

    public static void main(String[] args) {

        Parent obj = new Child();

        obj.display();

    }

}
