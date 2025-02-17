import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        //create array of size 10
        int arr[] = new int[10];

        //loop multiplication logic and assigning it in array
        for(int i = 1; i <= arr.length; i++){
            arr[i - 1] = number * i;
        }

        //loop for printing 
        for(int i = 0; i < arr.length; i++){
            System.out.println(number + " * " + (i + 1) + " = " + arr[i]);
        }

        input.close();
    }
}

