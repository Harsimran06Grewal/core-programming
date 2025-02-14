import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get side input from user
        System.out.println("Enter value of length: ");
        int length = input.nextInt();

        //calculate perimeter
        int perimeter = 4 * length;

        System.out.println(" The length of the side is " + length + " whose perimeter is " + perimeter);
    }
}
