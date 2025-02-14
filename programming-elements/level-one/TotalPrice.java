import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        //enter value of  unit price
        System.out.println("Enter value of unit price: ");
        int unitPrice = input.nextInt();

        //enter value of quantity
        System.out.println("Enter value of quantity: ");
        int quantity = input.nextInt();

        //calculating total price of an item
        int totalPrice = unitPrice * quantity;

        System.out.println("he total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        input.close();
    }
}
