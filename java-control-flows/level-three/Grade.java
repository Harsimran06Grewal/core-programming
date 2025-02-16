import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get marks of 3 subjects(physics, chemistry and maths) from user
        System.out.println("Enter marks in physics: ");
        float marksPhysics = input.nextFloat();

        System.out.println("Enter marks in chemistry: ");
        float marksChemistry = input.nextFloat();

        System.out.println("Enter marks in maths: ");
        float marksMaths = input.nextFloat();

        //calculating total marks
        float totalMarks = marksPhysics + marksChemistry + marksMaths;

        //calculating percentage
        float percentage  = ((totalMarks) * 100) / 300;

        //print average of 3 subjects
        System.out.println("Average is " + totalMarks / 3);

        //print percentage 
        System.out.println("Percentage is " + percentage);

        if(percentage >= 80){
            System.out.println("grade is A");
            System.out.println("Level 4, above agency-normalized standards");
            
        }
        else if(percentage >= 70 && percentage <= 79){
            System.out.println("grade is B");
            System.out.println("Level 3, at agency-normalized standards");
        }
        else if(percentage >= 60 && percentage <= 69){
            System.out.println("grade is C");
            System.out.println("Level 2, below, but approaching agency-normalized standards");
        }
        else if(percentage >= 50 && percentage <= 59){
            System.out.println("grade is D");
            System.out.println("Level 1, well below agency-normalized standards");
        }
        else if(percentage >= 40 && percentage <= 49){
            System.out.println("grade is E");
            System.out.println("Level 1- , too below agency-normalized standards");
        }
        else{
            System.out.println("grade is R");
            System.out.println("Remedial standards");
        }

        input.close();
    }
}
