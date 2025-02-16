import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        for(int i = 6; i <= 9; i++){
            int result = i * number;
            System.out.println(i + " * " + number + " = " + result);
        }

        input.close();
    }
}
