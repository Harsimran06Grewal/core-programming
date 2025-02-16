import java.util.Scanner;

public class RocketLaunch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter counter: ");
        int counter = input.nextInt();

        while(counter >= 1){
            System.out.println("Value of counter is: " + counter);
            counter--;
        }

        input.close();
    }
}
