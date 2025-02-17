import java.util.Scanner;

public class ReworkGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of students as input from the user
        System.out.println("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Create a 2D array to store marks for physics, chemistry, and maths for each student
        double[][] marks = new double[numberOfStudents][3]; 
        double[] percentage = new double[numberOfStudents];
        char[] grade = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ": ");
            
            // Input marks for physics, chemistry, and maths
            System.out.println("Enter marks of physics: ");
            marks[i][0] = input.nextDouble();
            
            System.out.println("Enter marks of chemistry: ");
            marks[i][1] = input.nextDouble();
            
            System.out.println("Enter marks of maths: ");
            marks[i][2] = input.nextDouble();

            // Check if any marks are negative 
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Marks cannot be negative. Please enter positive values.");
                i--;  
                continue; 
            }

            // Calculate total marks and percentage
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (totalMarks * 100) / 300;

            // Grade assignment based on the percentage
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';  
            }
        }

        // Display the results for all students
        System.out.println("\nResults for all students:");

        for (int i = 0; i < numberOfStudents; i++) {
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.println("Student " + (i + 1) + ": Total Marks = " + totalMarks
                               + ", Percentage = " + percentage[i] + "%, Grade = " + grade[i]);
        }

        input.close();
    }
}

