import java.util.Scanner;

public class NumberPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        if(number == 0){
            System.out.println("zero");
        }
        else if(number < 0){
            System.out.println("negative");
        }
        else{
            System.out.println("positive");
        }

        input.close();
    }
}
