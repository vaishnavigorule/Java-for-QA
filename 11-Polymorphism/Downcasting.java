class Parent {

    void show() {
        System.out.println("Parent");
    }

}

class Child extends Parent {

    void display() {
        System.out.println("Child");
    }

}

public class Downcasting {

    public static void main(String[] args) {

        Parent p = new Child();

        Child c = (Child) p;

        c.show();
        c.display();

    }

}
