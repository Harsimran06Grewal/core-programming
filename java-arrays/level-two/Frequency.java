import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number as input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

         int count = 0;
         int temp = number;  
 
         while (temp != 0) {
             temp /= 10;  // Remove the last digit
             count++;  // Increment the digit count
         }
 
         // Create an array to store each digit of the number
         int[] digits = new int[count];
         int index = 0;
 
         while (number != 0) {
             digits[index] = number % 10;  // Get the last digit
             number /= 10;  // Remove the last digit
             index++;  // Move to the next index in the array
         }
 
         // Create an array 
         int[] frequency = new int[10];
 
         for (int i = 0; i < count; i++) {
             frequency[digits[i]]++;  // Increment the frequency count for the current digit
         }
 
         // Print the frequency of each digit
         System.out.println("The frequency of each digit in the number is");
         for (int i = 0; i < 10; i++) {
             if (frequency[i] != 0) {  
                 System.out.println(i + " occurs " + frequency[i] + " times");
             }
         }

         input.close();
    }
}
