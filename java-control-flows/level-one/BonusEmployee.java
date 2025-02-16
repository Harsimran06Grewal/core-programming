import java.util.Scanner;

public class BonusEmployee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get salary input from user
        System.out.println("Enter salary: ");
        int salary = input.nextInt();

        //get years of service input from user
        int years = input.nextInt();

        if(years > 5){
            double bonus = ((5.0 / 100) * salary);
            System.out.println("Bonus amount after waorking " + years + " years  is " + bonus);
        }

        input.close();
    }
}
