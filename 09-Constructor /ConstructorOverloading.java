public class ConstructorOverloading {

    ConstructorOverloading() {

        System.out.println("Default Constructor");

    }

    ConstructorOverloading(String name) {

        System.out.println("Name : " + name);

    }

    ConstructorOverloading(String name,int age) {

        System.out.println(name + " " + age);

    }

    public static void main(String[] args) {

        new ConstructorOverloading();

        new ConstructorOverloading("Vaishnavi");

        new ConstructorOverloading("Vaishnavi",22);

    }

}
