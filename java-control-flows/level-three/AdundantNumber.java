import java.util.Scanner;

public class AdundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        //initialize sum with zero
        int sum = 0;

       for(int i = 1; i < number; i++){
            if(number % i == 0){
               sum += i; // Add divisor to sum
            }
       }

       // Check if sum of divisors is greater than the number
       if(sum > number){
        System.out.println(number + " is an Abundant Number");
       }
       else{
        System.out.println(number + " is not an Abundant Number");
       }

       input.close();
    }
}
