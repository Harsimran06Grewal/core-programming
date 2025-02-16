import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //create a variable total of double type and initial it 0.0;
        double total = 0.0;

        //get number input from user
        System.out.println("Enter number: ");
        double number = input.nextDouble();

        //variable sum
        int sum = 0;

        while(number != 0.0){
            total += number;
            number = input.nextDouble();
        }

        System.out.println(total);

        input.close();
    }
}
