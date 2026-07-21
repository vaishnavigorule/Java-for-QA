abstract class Employee {

    abstract void work();

}

class Developer extends Employee {

    @Override
    void work() {

        System.out.println("Developer is Coding");

    }

}

public class AbstractionPrograms {

    public static void main(String[] args) {

        Employee emp = new Developer();

        emp.work();

    }

}
