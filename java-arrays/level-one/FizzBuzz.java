import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        String arr[] = new String[number + 1];

        if(number > 0){
            for(int i = 1; i <= number; i++){
                //check divisibility with 3
                if(i % 3 == 0 && i % 5 == 0){
                   arr[i] = "FizzBuzz";
                }
                //check divisibility with 5
                else if(i % 3 == 0){
                    arr[i] = "Fizz";
                }
                //check divisibility with 3 and 5 both
                else if(i % 5 == 0){
                    arr[i] = "Buzz";
                }
                // otherwise save the i
                else{
                    arr[i] = String.valueOf(i);
                }
            }

            for(int i = 1; i <= number; i++){
                System.out.println("Position " + i + " = " + arr[i]);
            }
        }
        else{
            System.out.println("enter positive number");
        }

        input.close();
    }
}
