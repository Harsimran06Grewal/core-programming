import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //creating a variable number1
        System.out.println("Enter value of number1: ");
        float number1 = input.nextFloat();

        //creating a variable number2
        System.out.println("Enter value of number2: ");
        float number2 = input.nextFloat();

        //Addition 
        float add = number1 + number2;

        //subtraction 
        float subtract = number1 - number2;

        //multiplication
        float multiply = number1 * number2;

        //division 
        float division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + add + " , " + subtract + " , " + multiply + " and " + division);

        input.close();
    }
}
