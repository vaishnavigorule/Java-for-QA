public class NestedIf {

    public static void main(String[] args) {

        int age = 22;
        boolean hasLicense = true;

        if (age >= 18) {

            if (hasLicense) {
                System.out.println("Eligible to Drive");
            } else {
                System.out.println("Apply for License");
            }

        } else {
            System.out.println("Underage");
        }

    }
}
