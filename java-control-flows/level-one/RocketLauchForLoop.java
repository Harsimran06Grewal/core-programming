import java.util.Scanner;

public class RocketLauchForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get counter input from the user
        System.out.println("enter counter: ");
        int counter = input.nextInt();

        for(int i = counter; counter >= 1; counter--){
            System.out.println("value of counter is: " + counter);
        }

        input.close();
    }
}
