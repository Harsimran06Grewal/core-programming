import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        //creating a variable greatestFactor and assigning it value 1
        int greatestFactor = 1;

        for(int i = 1; i < number; i++){
            if(number % i == 0){
                if(greatestFactor < i){
                    greatestFactor = i;
                }
            }
        }

        System.out.println("Greatest Factor of " + number + " is " +  greatestFactor);

        input.close();
    }
}
