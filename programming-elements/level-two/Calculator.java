import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter value of number1: ");
        float number1 = input.nextFloat();

        System.out.println("Enter value of number2: ");
        float number2 = input.nextFloat();

        //to calculate addition of two numbers
        float addition = number1 + number2;

        //to calculate subtraction of two numbers
        float subtraction = number1 - number2;

        //to calculate multiplication of two numbers
        float multiplication = number1 * number2;

        //to calculate division of two numbers
        float division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + " , " + subtraction + " , " + multiplication + " and " + division);

        input.close();
    }
}