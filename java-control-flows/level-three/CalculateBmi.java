import java.util.Scanner;

public record CalculateBmi() {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get weight input in kg from user 
        System.out.println("Enter weight in kg: ");
        double weightKg = input.nextDouble();

        //get height input in cm from user
        System.out.println("Enter height in cm: ");
        double heightCm = input.nextDouble();

        //convert height in cm to meters
        double heightMeters = heightCm / 100;

        //calculate bmi 
        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("BMI is: " + bmi);

        //conditions for weight status based on BMI
        if(bmi <= 18.4){
            System.out.println("Underweight");
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Normal");
        }
        else if(bmi >= 25.0 && bmi <= 39.9){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }

        input.close();
    }
}
