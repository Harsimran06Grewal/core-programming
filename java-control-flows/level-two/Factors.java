import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.println("Factors of " + number + " are " + i);
            }
        }

        input.close();
    }
}
