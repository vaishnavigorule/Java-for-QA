public class ConstructorPrograms {

    String product;
    double price;

    ConstructorPrograms(String product,double price){

        this.product=product;
        this.price=price;

    }

    void display(){

        System.out.println(product);
        System.out.println(price);

    }

    public static void main(String[] args){

        ConstructorPrograms obj =
                new ConstructorPrograms("Laptop",55000);

        obj.display();

    }

}
