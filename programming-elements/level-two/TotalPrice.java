import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get unit price input from user
        System.out.println("Enter value of unit price: ");
        double unitPrice = input.nextInt();

        //get quantity input from user
        System.out.println("Enter the value of quantity: ");
        int quantity = input.nextInt();

        //calculate total price 
        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        input.close();
   } 
}
