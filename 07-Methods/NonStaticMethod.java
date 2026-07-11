public class NonStaticMethod {

    void display() {
        System.out.println("Non-Static Method");
    }

    public static void main(String[] args) {

        NonStaticMethod obj = new NonStaticMethod();

        obj.display();

    }
}
