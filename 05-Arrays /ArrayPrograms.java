public class ArrayPrograms {

    public static void main(String[] args) {

        int[] numbers={2,4,6,8,10};

        int evenCount=0;

        for(int num:numbers){

            if(num%2==0){
                evenCount++;
            }

        }

        System.out.println("Even Numbers = "+evenCount);

    }
}
