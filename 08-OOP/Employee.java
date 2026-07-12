public class Employee {

    int id;
    String name;
    double salary;

    void display() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);

    }

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.id = 101;
        emp.name = "Anjali";
        emp.salary = 45000;

        emp.display();

    }

}
