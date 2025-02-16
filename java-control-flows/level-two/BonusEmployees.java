import java.util.Scanner;

public class BonusEmployees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get salary input from user
        System.out.println("Enter salary: ");
        int salary = input.nextInt();

        //get years of service from user
        System.out.println("Enter years: ");
        int years = input.nextInt();

        if(years > 5){
            double bonus = (5.0 / 100) * salary;
            System.out.println("bonus of employee for " + years + " years is " + bonus);
        }

        input.close();
    }
}
