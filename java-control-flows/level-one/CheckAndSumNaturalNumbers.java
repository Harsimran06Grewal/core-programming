import java.util.Scanner;

public class CheckAndSumNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get a number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        //creating sum variable and assigning it value zero
        int sum;

        //checking number is a natural number
        if(number > 0){
           sum = number * (number + 1) / 2;

            System.out.println("The sum of " + number + " natural numbers is " + sum);
        }
        else{
            System.out.println("The number " + number + "  is not a natural number");
        }

    input.close();
    }
}
