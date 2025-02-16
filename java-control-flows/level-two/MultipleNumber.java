import java.util.Scanner;

public class MultipleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        System.out.println("\nMultiples of " + number + " below 100 are:");
        
        for(int i = 100; i >= 1; i--){
           if(i % number == 0){
            System.out.println(i);
           }
        }

        input.close();
    }
}
