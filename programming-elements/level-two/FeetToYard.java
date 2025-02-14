import java.util.Scanner;

public class FeetToYard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get distance in feet from user
        System.out.println("Enter the value of distance in feet: ");
        int distanceFeet = input.nextInt();

        //converting distance to yard
        int distanceYard = distanceFeet / 3;

        //converting distance to miles
        int distanceMiles = distanceYard / 1760;

        System.out.println("Distance in yards is: " + distanceYard);
        System.out.println("Distance in miles is: " + distanceMiles);

        input.close();
    }
}
