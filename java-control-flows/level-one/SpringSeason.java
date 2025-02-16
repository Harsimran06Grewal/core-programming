import java.util.Scanner;

public class SpringSeason{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //get month input from user
        System.out.println("Enter month: ");
        int month = input.nextInt();

        //get day input from user
        System.out.println("Enter day: ");
        int day = input.nextInt();

        boolean isSpring = false;

        switch(month){
            case 3:
                if(day >= 20){
                    isSpring = true;
                }
                break;
            case 4:
                isSpring = true;
                break;
            case 5:
                isSpring = true;
                break;
            case 6:
                if(day <= 20){
                    isSpring = true;
                }
                break;
        }

        if(isSpring){
            System.out.println("It's a Spring Season");
        }
        else{
            System.out.println("Not a Spring Season");
        }

        input.close();
    }
}
