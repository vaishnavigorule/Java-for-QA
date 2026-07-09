public class PalindromeString {

    public static void main(String[] args) {

        String original = "madam";
        String reverse = "";

        for(int i = original.length()-1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        if(original.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}
