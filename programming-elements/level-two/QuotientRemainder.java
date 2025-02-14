import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number1 and number2 input from user
        System.out.println("Enter value of number1: ");
        int number1 = input.nextInt();

        System.out.println("Enter value of number2: ");
        int number2 = input.nextInt();

        //calculate quotient
        int quotient = number1 / number2;
        
        //calculate remainder
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);

        input.close();
    }
}
