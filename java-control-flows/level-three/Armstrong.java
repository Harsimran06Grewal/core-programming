import java.util.Scanner;

class Armstrong{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        //initialize sum variable with zero
        int sum = 0;

        int originalNumber = number;

        //checking original number not equals to zero
        while(number != 0){
            int digit = number % 10; // finding the last digit
            sum += digit * digit * digit; // calculating cube of last digit
            number = number / 10; // removing last digit from number
        }

        //checking if sum is equals to number so that it satisfy armstrong condition
        if(sum  == originalNumber){
            System.out.println(originalNumber + " is armstrong");
        }
        else{
            System.out.println(originalNumber + " is not armstrong");
        }

        input.close();
    }
}