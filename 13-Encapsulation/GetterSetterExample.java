public class GetterSetterExample {

    private int age;

    public void setAge(int age) {

        this.age = age;

    }

    public int getAge() {

        return age;

    }

    public static void main(String[] args) {

        GetterSetterExample obj = new GetterSetterExample();

        obj.setAge(22);

        System.out.println(obj.getAge());

    }

}
