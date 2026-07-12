public class Car {

    String brand;
    String model;

    void details() {

        System.out.println(brand);
        System.out.println(model);

    }

    public static void main(String[] args) {

        Car car = new Car();

        car.brand = "Hyundai";
        car.model = "i20";

        car.details();

    }

}
