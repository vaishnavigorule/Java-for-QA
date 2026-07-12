public class Student {

    String name;
    int age;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Vaishnavi";
        s.age = 22;

        s.display();

    }

}
