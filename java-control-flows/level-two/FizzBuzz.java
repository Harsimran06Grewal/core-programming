import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        if(number <= 0){
            System.out.println("Enter a psoitive number: ");
        }
        else{
            for(int i = 1; i <= number; i++){
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
            }
        }

        input.close();
    }
}
