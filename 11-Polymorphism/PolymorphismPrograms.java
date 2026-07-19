class Employee {

    void work() {
        System.out.println("Employee Working");
    }

}

class Developer extends Employee {

    @Override
    void work() {
        System.out.println("Developer Writing Code");
    }

}

public class PolymorphismPrograms {

    public static void main(String[] args) {

        Employee emp = new Developer();

        emp.work();

    }

}
