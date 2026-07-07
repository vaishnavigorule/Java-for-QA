public class FindLargestElement {

    public static void main(String[] args) {

        int[] numbers={15,8,40,12,30};

        int largest=numbers[0];

        for(int num:numbers){

            if(num>largest){
                largest=num;
            }

        }

        System.out.println("Largest = "+largest);

    }
}
