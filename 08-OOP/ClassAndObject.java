class Student {

    String name = "Vaishnavi";
    int age = 22;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

}

public class ClassAndObject {

    public static void main(String[] args) {

        Student obj = new Student();

        obj.display();

    }

}
