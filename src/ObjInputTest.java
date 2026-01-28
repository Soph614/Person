public class ObjInputTest {

    public void main(String[] args) {

        SafeInputObj sio = new SafeInputObj();

        boolean done;

        do {

            String fullName = sio.getNonZeroLenString("Enter your full name");

            int YOB = sio.getRangedInt("Enter your year of birth", 1900, 2026);

            int homeSquareFootage = sio.getInt("Enter the approximate square footage of your home");

            double homeHeight = sio.getRangedDouble("Enter your home's height in feet", 1, 100);

            double homePropertyTaxOwedPerYear = sio.getDouble("Enter how much property tax you owe each year on the home mentioned above");

            System.out.println("Please review the information you have\nprovided and approve that it is correct:");
            System.out.println("Full name: " + fullName);
            System.out.println("YOB: " + YOB);
            System.out.println("Square footage of home: " + homeSquareFootage);
            System.out.println("Height of home: " + homeHeight);
            System.out.println("Property tax of home each year: " + homePropertyTaxOwedPerYear);

            done = sio.getYNConfirm("Is the information above correct?");

        }while(!done);

        String phoneNumber = sio.getRegExString("Enter your cell phone number to receive your results", "\\d{3}-\\d{3}-\\d{4}");
        System.out.println("Thank using ProTax! You should receive your results with 2-3 business days.");


    }
}
