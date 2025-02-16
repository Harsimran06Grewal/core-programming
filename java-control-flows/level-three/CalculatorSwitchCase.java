import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get first number , second number and operator as input
        System.out.println("Enter the first number: ");
        double first = input.nextDouble();

        System.out.println("Enter the second number: ");
        double second = input.nextDouble();

        System.out.println("Enter operator: ");
        String op = input.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                // Check if second number is not zero before dividing
                if(second != 0){
                    System.out.println("Result: " + (first / second));
                }
                else{
                    System.out.println("Division by zero not allowed");
                }
                break;
            default:
                //if operator is not one of the valid options
                System.out.println("Invalid Operator.");
                break;
        }

        input.close();
    }
}
