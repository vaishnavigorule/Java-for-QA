public class FindSmallestElement {

    public static void main(String[] args) {

        int[] numbers={15,8,40,12,30};

        int smallest=numbers[0];

        for(int num:numbers){

            if(num<smallest){
                smallest=num;
            }

        }

        System.out.println("Smallest = "+smallest);

    }
}
