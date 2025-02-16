import java.util.Scanner;

public class FactorialForLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        //creating a variable factorial assigning it value 1
        int factorial = 1;

        for(int i = 1; i <= number; i++){
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);

        input.close();
    }
}
