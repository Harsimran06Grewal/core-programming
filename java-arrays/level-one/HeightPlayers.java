import java.util.Scanner;

public class HeightPlayers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //create a array of size 11
        double heights[] =  new double[11];

        //get elements of array from user as input
        System.out.println("Enter height of 11 players: ");
        for(int i = 0; i < heights.length; i++){
            System.out.println("Enter height of the player " + (i + 1) + " : ");
            heights[i] = input.nextDouble();
        }

        //initialize mean with zero
        double sum = 0;

        for(int i = 0; i < heights.length; i++){
            sum += heights[i]; // calculate sum 
        }

        double meanHeight = sum / heights.length; // calculate mean

        System.out.println("Mean height of football team is: " + meanHeight);

        input.close();
    }
}
