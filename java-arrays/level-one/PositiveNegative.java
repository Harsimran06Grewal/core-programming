import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //created array of size 10
        double arr[] = new double[10];
        int i = 0;

        double total = 0.0;

        while(true){
            System.out.println("Enter number");
            double number = input.nextDouble();
            // check number is negative or array limit is reached
            if(number <= 0 || i >= 10){
                break;
            }
            // number is positive store it in array and increment
            arr[i] = number;
            i++;
        }

        // calculate total numbers entered
        for(int j = 0; j < arr.length; j++){
            total += arr[j];
        }

        System.out.println("Total of elements in array: " + total);

        input.close();
    }
}
