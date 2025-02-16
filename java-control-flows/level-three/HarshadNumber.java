import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        //initialize sum with zero
        int sum = 0;
        int originalNumber = number;

        //condition until number not eqal zero
        while(number != 0){
            int digit = number % 10; // finding last digit
            sum += digit; // adding last digit to sum
            number = number / 10; // removing last digit from number     
        }

        // condition for Harshad Number
        if(originalNumber % sum == 0){
            System.out.println(originalNumber + " is Harshad Number");
        }
        else{
            System.out.println(originalNumber + " is not a Harshad Number");
        }

        input.close();
    }
}
