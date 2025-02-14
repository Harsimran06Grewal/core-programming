import java.util.*;

public class DiscountedAmountInputUser {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //enter fee of student
        System.out.println("Enter the value of fee: ");
        int fee = input.nextInt();
        
        //enter percentage want to discount
        System.out.println("Enter the value of discount percentage: ");
        int discountPercent = input.nextInt();

        //calculating discount
        int discount = fee / discountPercent;

        //amount of fee to pay
        int feePay = fee - discount;

        System.out.println(" The discount amount is INR " + discount + "  and final discounted fee is INR " + feePay);

        input.close();
    }
}
