public class CompileTimePolymorphism {

    void show(int a) {
        System.out.println(a);
    }

    void show(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {

        CompileTimePolymorphism obj = new CompileTimePolymorphism();

        obj.show(100);
        obj.show("Java");

    }

}
