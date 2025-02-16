import java.util.Scanner;

class LeapYearAndOperator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get year input from user
        System.out.println("Enter year: ");
        int year = input.nextInt();

        //checking condition for Leap Year
        if(year >= 1582 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a Leap Year");
        }
        else{
            System.out.println(year + " is not a Leap Year");
        }

        input.close();
    } 
}