public class ParameterizedConstructor {

    String name;
    int age;

    ParameterizedConstructor(String name, int age) {

        this.name = name;
        this.age = age;

    }

    void display() {

        System.out.println(name);
        System.out.println(age);

    }

    public static void main(String[] args) {

        ParameterizedConstructor obj =
                new ParameterizedConstructor("Vaishnavi",22);

        obj.display();

    }

}
