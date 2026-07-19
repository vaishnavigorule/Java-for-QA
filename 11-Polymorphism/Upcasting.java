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

public class Upcasting {

    public static void main(String[] args) {

        Parent obj = new Child();

        obj.show();

    }

}
