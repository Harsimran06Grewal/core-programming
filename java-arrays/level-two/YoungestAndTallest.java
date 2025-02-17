import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays to store the ages and heights of the 3 friends
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + friends[i] + ": ");
            ages[i] = input.nextInt();
            
            System.out.println("Enter height of " + friends[i] + " in cm: ");
            heights[i] = input.nextDouble();
        }

        // Initialize variables to find the youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i; // Update index for youngest
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i; // Update index for tallest
            }
        }

        // Display the youngest and tallest
        System.out.println("The youngest friend is: " + friends[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is: " + friends[tallestIndex] + " with height " + heights[tallestIndex] + " cm");

        input.close();
    }
}
