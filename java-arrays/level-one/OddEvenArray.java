import java.util.Scanner;

public class OddEvenArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number input from user
        System.out.println("Enter number: ");
        int number = input.nextInt();

        if(number <= 0){
            System.out.println("Error : Please Enter positive number");
            return;
        }

        //defining size of array
        int size = number / 2 + 1;

        int oddArr[] = new int[size];
        int evenArr[] = new int[size];

        //initialize index for odd and even array
        int oddIndex = 0;
        int evenIndex = 0;

        for(int i = 1; i <= number; i++){
            if(i % 2 != 0){
                oddArr[oddIndex] = i;
                oddIndex++;
            }
            else{
                evenArr[evenIndex] = i;
                evenIndex++;
            }
        }

        System.out.println("Odd Numbers: ");
        for(int i = 0; i < oddIndex; i++){
            System.out.println(oddArr[i]);
        }

        System.out.println();

        System.out.println("Even Numbers: ");
        for(int i = 0; i < evenIndex; i++){
            System.out.println(evenArr[i]);
        }

        input.close();
    }
}