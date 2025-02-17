import java.util.Scanner;

public class SmalllestLargestArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        int maxDigit = 10;
        int array[] = new int[maxDigit];

        int index = 0;
        while(number != 0){
            if(index == maxDigit){
                break;
            }
            array[index] = number % 10; // get last digit
            number = number / 10; // remove last digit
            index++;
        }
        
        int largest = -1;
        int secondLargest = -1;

        for(int i = 1; i < array.length; i++){
            if(largest < array[i]){
                secondLargest = largest;
                largest = array[i];
            }
            else if(array[i] > secondLargest && array[i] != largest){ 
                secondLargest = array[i];
            }
        }

        System.out.println("Largest element in an array: " + largest);
        System.out.println("Second-largest element in an array: " + secondLargest);

        input.close();
    }
}
