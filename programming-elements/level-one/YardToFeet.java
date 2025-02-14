import java.util.Scanner;

public class YardToFeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get distance input from user in feet
        System.out.println("Enter value of distance: ");
        int distance = input.nextInt();

        //converting distance in feet to yards
        int yardDistance = distance / 3;

        //converting distance in yards to miles
        double yardMiles = yardDistance / 1760.0;

        System.out.println("distance in yards is " + yardDistance);
        System.out.println("distance in miles is " + yardMiles);

        input.close();
    }
}
