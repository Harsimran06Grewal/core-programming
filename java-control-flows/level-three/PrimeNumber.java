import java.net.SocketTimeoutException;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from the user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        if(number % number == 0){
            System.out.println(number + " is a prime number");
        }
    }
}
