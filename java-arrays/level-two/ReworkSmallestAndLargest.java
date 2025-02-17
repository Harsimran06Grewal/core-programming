import java.util.Scanner;

class ReworkSmallestAndLargest{
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int maxDigit = 10;  // Initial size
        int[] digits = new int[maxDigit];  // Array to store digits
        int count = 0;  

        while (number != 0) {
            // Resize the array if index equals maxDigit
            if (count == maxDigit) {
                // Increase the size of the array by 10
                maxDigit += 10;
                int[] temp = new int[maxDigit];

                // Copy the current digits array to the new temp array
                System.arraycopy(digits, 0, temp, 0, digits.length);

                // Point the original digits array to the new temp array
                digits = temp;
            }

            // Store the last digit of the number
            digits[count] = number % 10;
            number /= 10;  // Remove the last digit from the number
            count++;  // Increment the index
        }

        // Find the largest and second-largest numbers
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        input.close();
    }
}