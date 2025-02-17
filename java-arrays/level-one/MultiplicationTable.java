import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        int number = input.nextInt();

        //creating array of size 4
        int arr[] = new int[4];

        for(int i = 6; i <= 9; i++){
            arr[i - 6] = number * i;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(number + " * " + (i + 6) + " = " + arr[i]);
        }

        input.close();
    }
}




