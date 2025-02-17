import java.util.Scanner;

public class MultiDimensionalBmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get number of persons as input from user
        System.out.println("Enter number of persons: ");
        int persons = input.nextInt();

        double personData[][] = new double[persons][3];
        String[] weightStatus = new String[persons];

        for(int i = 0; i < persons; i++){
            System.out.println("Enter weight of person: ");
            double weight = input.nextDouble();

            System.out.println("Enter height of person: ");
            double height = input.nextDouble();

            if(weight < 0 || height < 0){
                System.out.println("Enter positive values");
                break;
            }

            personData[i][0] = weight; // stores weight of person
            personData[i][1] = height; // stores height of person
            personData[i][2] = weight / (height * height); // calculating bmi

            if(personData[i][2] <= 18.4){
                weightStatus[i] = "Underweight";
            }
            else if(personData[i][2] >= 18.5 && personData[i][2] <= 24.9){
                weightStatus[i] = "Normal";
            }
            else if(personData[i][2] >= 25.0 && personData[i][2] <= 39.9){
                weightStatus[i] = "OverWeight";
            }
            else{
                weightStatus[i] = "Obese";
            }
        }
        

        for(int i = 0; i < personData.length; i++){
            System.out.println(personData[i][0] + " , " + personData[i][1] + " , " + personData[i][2] + " , " + weightStatus[i]);
        }

        input.close();
    }
}

