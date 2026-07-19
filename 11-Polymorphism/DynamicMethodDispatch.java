class Vehicle {

    void start() {
        System.out.println("Vehicle Started");
    }

}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car Started");
    }

}

public class DynamicMethodDispatch {

    public static void main(String[] args) {

        Vehicle obj = new Car();

        obj.start();

    }

}
