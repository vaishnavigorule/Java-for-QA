abstract class Animal {

    abstract void sound();

    void sleep() {
        System.out.println("Animal is Sleeping");
    }

}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }

}

public class AbstractClassExample {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
        dog.sleep();

    }

}
