import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get input from user
        System.out.println("Enter value of a: ");
        int a = input.nextInt();

        System.out.println("Enter value of b: ");
        int b = input.nextInt();

        System.out.println("Enter value of c: ");
        int c = input.nextInt();

        int result1 = a + b * c; //multiplication has more precedence than addition
        int result2 = a * b + c; //multiplication has more precedence than addition
        int result3 = c + a / b; //division has more precedence than addition
        int result4 = a % b + c; //modulus has more precedence than addition

        System.out.println(" The results of Int Operations are " + result1 + " , " + result2 + " , " + result3 + " , " + result4);

        input.close();
    }
}
