public class DiscountedAmount {
    public static void main(String[] args) {
        int fee = 125000;
        int discount = 10;

        //calculating amount after discount
        int discountedAmount = fee / discount;

        //calculating fee to pay after discount
        int amountToPay = fee - discountedAmount;

        System.out.println(" The discount amount is INR " + discountedAmount + "  and final discounted fee is INR "+ amountToPay);
    }
}
