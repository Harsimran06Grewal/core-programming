import java.util.Scanner;

public class FizzBuzzWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        //checking if number is negative or equal to zero
        if(number <= 0){
            System.out.println("Enter positive number");
        }

        //initialization
        int i = 1;

        //condition
        while(i <= number){
            //checking if it is multiple of 3
            if(i % 3 == 0){
                System.out.println("Fizz");
            }
            //checking if it is multiple of 5
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            //checking if it is multiple of 3 and 5 both
            else if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println(i);
            }
            //updation
            i++;
        }

        input.close();
    }
}
