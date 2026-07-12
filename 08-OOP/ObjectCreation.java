class Employee {

    String name = "Rahul";

    void work() {
        System.out.println(name + " is working.");
    }

}

public class ObjectCreation {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.work();

    }

}
