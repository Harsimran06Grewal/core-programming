import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        int maxFactor = 10;

        int factors[] = new int[maxFactor];
        int index = 0;

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                if(index == maxFactor){
                    maxFactor *= 2;
                    int temp[] = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j]; // Copy each element
                    }
                    factors = temp; 
                }
                factors[index] = i;
                index++;
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }   
}
