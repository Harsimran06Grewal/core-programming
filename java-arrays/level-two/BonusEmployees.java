import java.util.Scanner;

public class BonusEmployees {
        public static void main(String[] args) {
            // Create a Scanner object to get user input
            Scanner input = new Scanner(System.in);
    
            // Create arrays to store salary, years of service, new salary, and bonus for 10 employees
            double[] salary = new double[10];
            double[] years = new double[10];
            double[] newSalary = new double[10];
            double[] bonus = new double[10];
    
            // Variables to track total bonus, total old salary, and total new salary
            double totalBonus = 0.0;
            double totalOldSalary = 0.0;
            double totalNewSalary = 0.0;
    
            // Loop to input the salary and years of service for each employee
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter the salary of employee " + (i + 1));
                salary[i] = input.nextDouble();
    
                // Validate the salary input (must be positive)
                if (salary[i] <= 0) {
                    System.out.println("Please enter a valid salary");
                    i--;  // Decrement i to repeat the input for the current employee
                    continue;  // Skip the rest of the loop and go to the next iteration
                }
    
                System.out.println("Enter the years of service of employee " + (i + 1));
                years[i] = input.nextDouble();
    
                // Validate the years of service input (must be positive)
                if (years[i] <= 0) {
                    System.out.println("Please enter a valid year of service");
                    i--;  // Decrement i to repeat the input for the current employee
                }
            }
    
            // Loop to calculate the bonus and new salary for each employee
            for (int i = 0; i < 10; i++) {
                // Calculate bonus based on years of service
                if (years[i] > 5) {
                    bonus[i] = salary[i] * 0.05;  // 5% bonus for employees with more than 5 years of service
                } else {
                    bonus[i] = salary[i] * 0.02;  // 2% bonus for employees with 5 or fewer years of service
                }
    
                // Calculate the new salary by adding the bonus to the original salary
                newSalary[i] = salary[i] + bonus[i];
    
                // Update total values for bonus, old salary, and new salary
                totalBonus += bonus[i];
                totalOldSalary += salary[i];
                totalNewSalary += newSalary[i];
            }
    
            // Print the total payout details
            System.out.println("The total bonus payout is " + totalBonus);
            System.out.println("The total old salary payout is " + totalOldSalary);
            System.out.println("The total new salary payout is " + totalNewSalary);

        input.close();
    }
}
