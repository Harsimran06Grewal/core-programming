import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        if(number <= 0){
            System.out.println("Not a Natural Number");
        }

        for(int i = 1; i <= number; i++){
            if(i % 2 == 0){
                System.out.println(i + " is a Even Number");
            }
            else{
                System.out.println(i+ " is a Odd Number");
            }
        }

        input.close();
    }
}
