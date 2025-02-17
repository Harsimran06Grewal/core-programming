import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number as input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

       // Initialize a variable count with zero
       int count = 0;
       int temp = number;  // Create a temporary variable that stores  the original number

       while (temp != 0) {
           temp /= 10;  // Remove the last digit
           count++;     // Increment the digit count
       }

       // Create an array to store the digits of the number
       int[] digits = new int[count];
       int index = 0;

       while (number != 0) {
           digits[index] = number % 10;  // Get the last digit of the number
           number /= 10;  // Remove the last digit from the number
           index++;  // Move to the next index in the digits array
       }

       // Create an array to store the reversed digits
       int[] reverse = new int[count];

       // Reverse the order of the digits
       for (int i = 0; i < count; i++) {
           reverse[i] = digits[count - i - 1];  // Assign the digits in reverse order
       }

       // Print the reverse of the number
       System.out.println("The reverse of the number is");
       for (int i = 0; i < count; i++) {
           System.out.print(reverse[i]);  // Print each digit of the reversed number
       }

       input.close();
    }
}
