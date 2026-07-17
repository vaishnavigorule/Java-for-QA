public class CopyConstructorDemo {

    String name;
    int age;

    CopyConstructorDemo(String name,int age) {

        this.name=name;
        this.age=age;

    }

    CopyConstructorDemo(CopyConstructorDemo obj){

        this.name=obj.name;
        this.age=obj.age;

    }

    void display(){

        System.out.println(name+" "+age);

    }

    public static void main(String[] args){

        CopyConstructorDemo s1 =
                new CopyConstructorDemo("Vaishnavi",22);

        CopyConstructorDemo s2 =
                new CopyConstructorDemo(s1);

        s2.display();

    }

}
