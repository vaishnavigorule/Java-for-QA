class Parent {

    String name = "Java";

}

class Child extends Parent {

    String name = "Selenium";

    void show() {

        System.out.println(super.name);

        System.out.println(this.name);

    }

}

public class SuperKeyword {

    public static void main(String[] args) {

        Child obj = new Child();

        obj.show();

    }

}
