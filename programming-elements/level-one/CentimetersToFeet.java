import java.util.Scanner;

public class CentimetersToFeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //enter height in cms
        System.out.println("Enter value of height in cm: ");
        double heightInCm = input.nextDouble();

        //converting height in cms to inches
        double inchesHeight = heightInCm / 2.54;

        //calculating height in inches to feet
        int feetHeight = (int) (inchesHeight / 12);

        //calculating remaining inches
        int remainingInches = (int) (inchesHeight % 12);

        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feetHeight + " and inches is " + remainingInches);

        input.close();
    }
}
