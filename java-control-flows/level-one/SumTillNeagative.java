import java.util.Scanner;

public class SumTillNeagative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //create total variable of double data type ans assigning it value 0.0
        double total = 0.0;

        //start an infinite loop 
        while(true){
            //get number input from user
            double number = input.nextDouble();
    
            //if number is negative or zero
            if(number <= 0){
                break;
            }

            total += number;
        }

        System.out.println(total);

        input.close();
    }
}
