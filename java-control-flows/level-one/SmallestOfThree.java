import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get 3 numbers from user
        System.out.println("Enter number1: ");
        int number1 = input.nextInt();

        System.out.println("Enter number2: ");
        int number2 = input.nextInt();

        System.out.println("Enter number3: ");
        int number3 = input.nextInt();

        if(number1 < number2 && number1 < number3){
            System.out.println("Is the first number the smallest? " + "Yes");
        }
        else{
            System.out.println("Is the first number the smallest? " + "No"); 
        }

        input.close();
    }
}
