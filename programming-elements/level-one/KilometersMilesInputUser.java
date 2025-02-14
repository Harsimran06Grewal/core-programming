import java.util.Scanner;

public class KilometersMilesInputUser {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //enter distance in kilometer
        System.out.println("Enter value of distance in km: ");
        double distanceKm = input.nextDouble();

        //converting distance from km to miles
        double miles = distanceKm * 1.6;

        System.out.println(" The total miles is " + miles + " mile for the given " + distanceKm + "km");

        input.close();
    }
}
