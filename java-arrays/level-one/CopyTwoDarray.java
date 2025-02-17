import java.util.Scanner;

public class CopyTwoDarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get rows and columns input from user
        System.out.println("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.println("Enter number of columns: ");
        int columns = input.nextInt();

        //create 2d array
        int matrix[][] = new int[rows][columns];

        //input 2d array elements from user
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = input.nextInt();
            }
        }

        int arr[] = new int[rows * columns];
        int index = 0;

        //copying elements of 2d array to 1d array
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                arr[index] = matrix[i][j];
                index++;
            }
        }

        System.out.println("Elements in 1d arrays: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
