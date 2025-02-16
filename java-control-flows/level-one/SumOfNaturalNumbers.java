import java.util.Scanner;

public class SumOfNaturalNumbers {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //get number from user
    System.out.println("Enter number: ");
    int number = input.nextInt();

    //calculating sum of natural numbers
    if(number > 0){
        int sum1 = (number * (number + 1)) / 2;
        System.out.println("Sum of " + number + " natural numbers is " + sum1);
    }

    //another way 
    int i = 1;
    int sum = 0;

    //condition
    while(i <= number){
        sum += i;
        //updation
        i++;
    }

    System.out.println("Sum of " + number + " natural numbers is " + sum);

    input.close();
   } 
}
