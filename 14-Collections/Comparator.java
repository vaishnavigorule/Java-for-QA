import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {

    String name;
    int salary;

    Employee(String name, int salary) {

        this.name = name;
        this.salary = salary;

    }
}

public class ComparatorExample {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Amit", 50000));
        employees.add(new Employee("Rahul", 30000));
        employees.add(new Employee("Priya", 40000));

        Collections.sort(employees, new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {

                return e1.salary - e2.salary;

            }

        });

        for (Employee employee : employees) {

            System.out.println(
                    employee.name + " " + employee.salary);

        }

    }
}
