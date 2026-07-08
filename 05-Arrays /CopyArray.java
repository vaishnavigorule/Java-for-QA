public class CopyArray {

    public static void main(String[] args) {

        int[] source={10,20,30,40};

        int[] destination=new int[source.length];

        for(int i=0;i<source.length;i++){
            destination[i]=source[i];
        }

        for(int num:destination){
            System.out.println(num);
        }

    }
}
