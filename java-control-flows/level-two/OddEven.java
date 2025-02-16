import java.util.Scanner;

class OddEven{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        //checking number is natural number or not
        if(number <= 0){
            System.out.println(number + " number is not a natural number");
        }

        for(int i = 1; i <= number; i++){
            //checking number is even
            if(i % 2 == 0){
                System.out.println(i + " is Even Number");
            }
            //checking number is odd
            else{
                System.out.println(i + " is Odd Number");
            }
        }

        input.close();
    }
}