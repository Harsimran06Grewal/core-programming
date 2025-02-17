import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of students as input from the user
        System.out.println("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Create arrays to store marks, percentages, and grades of the students
        double[] marksPhysics = new double[numberOfStudents];
        double[] marksChemistry = new double[numberOfStudents];
        double[] marksMaths = new double[numberOfStudents];
        double[] percentage = new double[numberOfStudents];
        char[] grade = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            // Input marks for each student in physics, chemistry, and maths
            System.out.println("Enter marks of physics for student " + (i + 1) + ": ");
            marksPhysics[i] = input.nextDouble();

            System.out.println("Enter marks of chemistry for student " + (i + 1) + ": ");
            marksChemistry[i] = input.nextDouble();

            System.out.println("Enter marks of maths for student " + (i + 1) + ": ");
            marksMaths[i] = input.nextDouble();

            // Check if any marks are negative, enter marks again
            if (marksPhysics[i] < 0 || marksChemistry[i] < 0 || marksMaths[i] < 0) {
                System.out.println("Marks cannot be negative. Please enter positive values.");
                i--; 
                continue;  
            }

            // Calculate total marks and percentage
            double totalMarks = marksPhysics[i] + marksChemistry[i] + marksMaths[i];
            percentage[i] = (totalMarks * 100) / 300;

            // grade based on percentage
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } 
            else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } 
            else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } 
            else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } 
            else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } 
            else {
                grade[i] = 'R'; 
            }
        }

        // display the results for each student
        System.out.println("\nResults for all students:");

        for (int i = 0; i < numberOfStudents; i++) {
            double totalMarks = marksPhysics[i] + marksChemistry[i] + marksMaths[i];
            System.out.println("Student " + (i + 1) + ": Total Marks = " + totalMarks
                               + ", Percentage = " + percentage[i] + "%, Grade = " + grade[i]);
        }

        input.close();
    }
}
