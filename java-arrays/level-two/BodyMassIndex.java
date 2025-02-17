import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number of persons as input from user
        System.out.println("Enter number of persons: ");
        int persons = input.nextInt();

        //created arrays for storing weight, height, bmi and weightStatus of every person
        double weight[] = new double[persons];
        double height[] = new double[persons];
        double bmi[] = new double[persons];
        String weightStatus[] = new String[persons];

        for(int i = 0; i < bmi.length; i++){
            System.out.println("Enter details for person " + (i + 1) + ": ");
            System.out.println("Enter weight of person: ");
            weight[i] = input.nextDouble();

            System.out.println("Enter height of person: ");
            height[i] = input.nextDouble();

            // Calculate body mass index
            bmi[i] = weight[i] / (height[i] * height[i]);

            if(bmi[i] <= 18.4){
                weightStatus[i] = "Underweight";
            }
            else if(bmi[i] >= 18.5 && bmi[i] <= 24.9){
                weightStatus[i] = "Normal";
            }
            else if(bmi[i] >= 25.0 && bmi[i] <= 39.9){
                weightStatus[i] = "OverWeight";
            }
            else{
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("BMi Report: ");
        System.out.println("Height Weight BMI   Weight Status");
        for(int i = 0; i < bmi.length; i++){
            System.out.println(height[i] + " , " + weight[i] + " , " + bmi[i] + " , " +  weightStatus[i]);
        }

        input.close();
    }
}
