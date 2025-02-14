import java.util.Scanner;

public class AreaOfSquareToFeetInches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get base input from user
        System.out.println("Enter the value of base in cm: ");
        double baseCm = input.nextDouble();

        //get height input from the user
        System.out.println("Enter the value of height in cm: ");
        double heightCm = input.nextDouble();

        //calculate area of triangle 
        double areaOfTriangle = 0.5 * baseCm * heightCm;

        // Convert  centimeters to inches (1 inch = 2.54 cm)
        double baseInches = baseCm / 2.54;
        double heightInches = heightCm / 2.54;

        // Calculate area in square centimeters
        double areaInSquareCm = 0.5 * baseCm * heightCm;

        //calculate arera in sqauare inches
        double areaOfTriangleInches = 0.5 * baseInches * heightInches;

        // Convert square inches to square feet (1 sq ft = 144 sq in)
        double areaOfTriangleFeet = areaOfTriangleInches / 144;

        System.out.println("The area of the triangle is " + areaOfTriangleFeet + " square feet and " + areaOfTriangleInches + " square inches.");

        input.close();
    }
}
