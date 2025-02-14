import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //creating a variable number of students
        System.out.println("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        //calculating maximum number of handshakes among n number of students
        int possibleHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is " + possibleHandshakes +  " for n number of students " + numberOfStudents);

        input.close();
    }
}
