import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get input number from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        //initializing count variable with zero
        int count = 0;

        //condition if number is 0 then count becomes 1
        if(number == 0){
            count = 1;
        }
        else{
            //condition if number not equal to zero
            while(number != 0){
                //removing digit from number
                number = number / 10;
                count++; // after removing last digit from number increasing count by 1
            }
        }

        System.out.println("Count of number: " + count);

        input.close();
    }
}
