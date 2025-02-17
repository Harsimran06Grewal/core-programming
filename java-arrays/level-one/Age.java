import java.util.Scanner;

class Age{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //creating array of size 10
        int ages[] = new int[10];

        //input elements in array
        for(int i = 0; i < ages.length; i++){
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        for(int i = 0; i < ages.length; i++){
            //condition if age is negative
            if(ages[i] < 0){
                System.out.println("Invalid Age");
            }
            //condition if age is greater than or equal to 18
            else if(ages[i] >= 18){
                System.out.println(" The student with the age " + ages[i] + " can vote");
            }
            //condition if age is less than 18
            else{
                System.out.println(" The student with the age " + ages[i] + " cannot vote");
            }
        }

        input.close();
    }
}

