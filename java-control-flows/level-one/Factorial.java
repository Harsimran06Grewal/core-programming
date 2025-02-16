import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        //creating a variable factorial and assigning it value 1
        int factorial = 1;

        //Initialization
        int i = 1;

        //Condition
        while(i <= number){
            factorial *= i;
            //updation
            i++;
        }

        System.out.println("Factorial of " + number + " is " + factorial);

        input.close();
    }
}
