import java.util.*;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get input from user
        System.out.println("Enter value of a: ");
        double a = input.nextInt();

        System.out.println("Enter value of b: ");
        double b = input.nextInt();

        System.out.println("Enter value of c: ");
        double c = input.nextInt();

        double result1 = a + b * c; //multiplication has more precedence than addition
        double result2 = a * b + c; //multiplication has more precedence than addition
        double result3 = c + a / b; //division has more precedence than addition
        double result4 = a % b + c; //modulus has more precedence than addition

        System.out.println(" The results of Int Operations are " + result1 + " , " + result2 + " , " + result3 + " , " + result4);

        input.close();
    }
}


