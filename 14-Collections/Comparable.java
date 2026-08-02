import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    int marks;

    Student(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Student student) {

        return this.marks - student.marks;

    }
}

public class ComparableExample {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(80));
        students.add(new Student(60));
        students.add(new Student(90));

        Collections.sort(students);

        for (Student s : students) {

            System.out.println(s.marks);

        }

    }
}
